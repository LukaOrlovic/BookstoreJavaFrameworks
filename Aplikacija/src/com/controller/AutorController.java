package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.domen.Autor;
import com.service.KnjizaraService;

@Controller
@RequestMapping("/autor")
public class AutorController {

	@Autowired
	private KnjizaraService knjizaraServis;
	
	
	@GetMapping("/list")
	public String listAutore(Model theModel){
		
		List<Autor> autori = knjizaraServis.dajAutore();
		
		theModel.addAttribute("autori", autori);
		
		return "list-autore";
	}
	
	@GetMapping("/showFormAddAutor")
	public String showFormForAddAutor(Model theModel){
		
		Autor autor = new Autor();
		
		theModel.addAttribute("autor", autor);
		
		return "autor-form";
	}
	
	
	@PostMapping("/saveAutor")
	public String saveAutor(@ModelAttribute("autor") Autor autor){
		
		knjizaraServis.sacuvajAutora(autor);
		
		return "redirect:/autor/list";
	}
	
	
	
	
}
