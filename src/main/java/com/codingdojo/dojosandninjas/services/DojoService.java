package com.codingdojo.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {

	@Autowired
	private DojoRepository dojoRepository;
	
	// Create Dojo
	public Dojo createDojo(Dojo dojo) {
		System.out.println(dojo.getId());
		return dojoRepository.save(dojo);
	}
	
	// Get All Dojos
	public List<Dojo> allDojos() {
		return dojoRepository.findAll();
	}
	
	// Find One Dojo
	public Dojo oneDojo(Long id) {
		return dojoRepository.findById(id).orElse(null);
	}
	
	// Update Expense
	public void updateDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	
	// Delete Dojo
	public void deleteDojo(Long id) {
		dojoRepository.deleteById(id);
	}
	
	
}
