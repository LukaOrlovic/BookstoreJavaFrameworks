package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.AutorDAO;
import com.dao.KnjigaDAO;
import com.dao.PoreskaStopaDAO;
import com.domen.Autor;
import com.domen.Knjiga;
import com.domen.PoreskaStopa;
import com.service.KnjizaraService;

@Controller
@RequestMapping("/knjiga")
public class KnjigaController {

	@Autowired
	private AutorDAO autorDao;

	@Autowired
	private KnjigaDAO knjigaDao;

	@Autowired
	private KnjizaraService knjizaraServis;

	@Autowired
	private PoreskaStopaDAO poreskaStopaDao;

	@RequestMapping("/list")
	public String listKnjige(Model theModel) {

		List<Knjiga> knjige = knjigaDao.dajKnjige();

		theModel.addAttribute("knjige", knjige);

		return "list-knjige";
	}

	@GetMapping("/showFormAddKnjiga")
	@Transactional
	public String showFormAddKnjiga(Model theModel) {

		Knjiga knjiga = new Knjiga();

		List<Autor> autori = autorDao.dajAutore();

		List<PoreskaStopa> stope = poreskaStopaDao.dajStope();

		theModel.addAttribute("knjiga", knjiga);
		theModel.addAttribute("autori", autori);
		theModel.addAttribute("stope", stope);

		return "knjiga-form";
	}

	@PostMapping("/saveKnjiga")
	@Transactional
	public String saveKnjiga(@RequestParam("nazivKnjige") String nazivKnjige,
			@RequestParam("zanr") String zanr,
			@RequestParam("cena") String cena,
			@RequestParam("poreskaStopa") String poreskaStopaN,
			@RequestParam("autor") String autorN,
			@RequestParam("sifraKnjige")String sifraKnjige) {

		Knjiga knjiga = new Knjiga();

		if(sifraKnjige != null){
			
			int sifra = Integer.parseInt(sifraKnjige);
			knjiga.setSifraKnjige(sifra);
			
		}
		
		knjiga.setZanr(zanr);
		knjiga.setNazivKnjige(nazivKnjige);
		knjiga.setCena(Double.parseDouble(cena));

		// System.out.println(zanr+" "+nazivKnjige+" "+cena);

		Autor autor = autorDao.nadjiAutora(autorN);
		knjiga.setAutor(autor);

		PoreskaStopa poreskaStopa = poreskaStopaDao
				.nadjiPoreskuStopu(poreskaStopaN);
		knjiga.setPoreskaStopa(poreskaStopa);

		knjizaraServis.saveKnjiga(knjiga);

		return "redirect:/knjiga/list";
	}

	@GetMapping("/azurirajForma")
	@Transactional
	public String azurirajForma(@RequestParam("sifraKnjige") int sifraKnjige,
			Model theModel) {

		Knjiga knjiga = knjizaraServis.nadjiKnjigu(sifraKnjige);

		List<Autor> autori = autorDao.dajAutore();

		List<PoreskaStopa> stope = poreskaStopaDao.dajStope();

		theModel.addAttribute("knjiga", knjiga);
		theModel.addAttribute("autori", autori);
		theModel.addAttribute("stope", stope);

		return "knjiga-form";
	}
	
	@GetMapping("/izbrisi")
	@Transactional
	public String obrisiKnjigu(@RequestParam("sifraKnjige")int sifraKnjige){
		
		knjizaraServis.izbrisiKnjigu(sifraKnjige);
		
		return "redirect:/knjiga/list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
