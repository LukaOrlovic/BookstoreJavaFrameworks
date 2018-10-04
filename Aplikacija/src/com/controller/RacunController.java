package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.RacunDAO;
import com.domen.Racun;

@Controller
@RequestMapping("/racun")
public class RacunController {

	@Autowired
	private RacunDAO racunDao;
	
	
	@RequestMapping("/list")
	public String listRacune(Model theModel){
		
		List<Racun> racuni = racunDao.dajRacune();
		
		theModel.addAttribute("racuni", racuni);
		
		return "list-racuni";
	}	
}
