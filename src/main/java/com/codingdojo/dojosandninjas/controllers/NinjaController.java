package com.codingdojo.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.DojoService;
import com.codingdojo.dojosandninjas.services.NinjaService;

@Controller
public class NinjaController {

//	
//	@Autowired 
//	DojoService dojoService;
//	
//	@Autowired
//	NinjaService ninjaService;
//	
//	@GetMapping("/ninjas/new")
//	public String index(
//			@ModelAttribute("ninja") Ninja ninja,
//			Model model
//			) {
//		List<Dojo> dojos = dojoService.allDojos();
//		model.addAttribute("dojos", dojos);
//		return "newNinja.jsp";
//	}
//	
//	@PostMapping("/ninja/create")
//	public String createNinja(
//			@Valid @ModelAttribute("ninja") Ninja ninja,
//			BindingResult result) {
//		if(result.hasErrors()) {
//			System.out.println(result);
//			return "redirect:/ninjas/new";
//		}
//		else {
//			System.out.println(ninja);
//			System.out.println(ninja.getFirstName());
//			ninjaService.createNinja(ninja);
//			System.out.println(ninja.getId());
//			return "redirect:/ninjas/new";
//		}	
//		
//	}
	
	
	
}
