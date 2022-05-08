package com.codingdojo.dojosandninjas.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.DojoService;
import com.codingdojo.dojosandninjas.services.NinjaService;

@Controller 
public class DojoController {
	
	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/dojos";
	}
	
	@GetMapping("/dojos") 
		public String newDojo(
				@ModelAttribute("dojo") Dojo dojo,
				Model model) {
		model.addAttribute("dojo", dojo);
		return "index.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(
			@Valid @ModelAttribute("dojo") Dojo dojo,
			BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "redirect:/ninjas/new";
		}
		else {
			System.out.println(dojo);
			System.out.println(dojo.getName());
			dojoService.createDojo(dojo);
			System.out.println(dojo.getId());
			return "redirect:/";
		}	
		
	}
	
	@GetMapping("/ninjas/new")
	public String index(
			@ModelAttribute("ninja") Ninja ninja,
			Model model
			) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninja/create")
	public String createNinja(
			@Valid @ModelAttribute("ninja") Ninja ninja,
			BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "redirect:/ninjas/new";
		}
		else {
			System.out.println(ninja);
			System.out.println(ninja.getFirstName());
			ninjaService.createNinja(ninja);
			System.out.println(ninja.getId());
			return "redirect:/ninjas/new";
		}	
		
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojosNinjas(
			@PathVariable("id") Long id,
			Model model
			) {
		Dojo dojo = dojoService.oneDojo(id);
		model.addAttribute("dojo", dojo);
		return "dojoNinjas.jsp";
	}
	
	
	
}
