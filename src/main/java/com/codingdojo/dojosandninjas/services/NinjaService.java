package com.codingdojo.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	@Autowired
	private NinjaRepository ninjaRepository;
	
	// Create Ninja
	public Ninja createNinja(Ninja ninja) {
		System.out.println(ninja.getId());
		return ninjaRepository.save(ninja);
	}
	
	// Get All Ninja
	public List<Ninja> allNinjas() {
		return ninjaRepository.findAll();
	}
	
	// Find One Ninja
	public Ninja oneNinja(Long id) {
		return ninjaRepository.findById(id).orElse(null);
	}
	
	// Update Ninja
	public void updateDojo(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
	
	// Delete Ninja
	public void deleteDojo(Long id) {
		ninjaRepository.deleteById(id);
	}
}
