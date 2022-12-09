package com.saraya.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.model.owners.copy.Owner;
import com.saraya.model.owners.copy.Pet;
import com.saraya.service.PetService;

@Controller
public class PetController {
	
	@Autowired
	private PetService service;
	
	@RequestMapping(value="/pets-list")
	public String getAllPets(ModelMap model){
		model.addAttribute("pets",service.getAllPets());
		return "pets-list";
	}
	
	@RequestMapping(value="/add-pet", method=RequestMethod.GET)
	public String addOwner(ModelMap model) {
		model.addAttribute("pets", new Pet());
		return "add-pet";
	}
	
	@RequestMapping(value="/add-pet", method=RequestMethod.POST)
	public String addedPet(@Valid @ModelAttribute ("pets")  Pet pet, BindingResult result) {
		if(result.hasErrors()) {
			return "add-pet";
		}
		service.addPet(pet.getName(), pet.getDateOfBirth(), pet.getPetTypes(),null);
		return "redirect:/pets-list";
	}
	
	@RequestMapping(value="/update-pet", method=RequestMethod.GET)
	public String updateOwner(@RequestParam int petId,ModelMap model) {
		model.addAttribute("pets", service.detailsPet(petId));
		return "add-pet";
	}
	

	@RequestMapping(value="/update-pet", method=RequestMethod.POST)
	public String updatedPet(@Valid Pet pet, BindingResult result) {
		if(result.hasErrors()) {
			return "add-pet";
			
		}
		service.updatePet(pet);
		return "redirect:/pets-list";

	}
	
	
	@RequestMapping(value="/delete-pet", method=RequestMethod.GET)
	public String delOwner(@RequestParam int petId) {
		service.deletePet(petId);
		return "redirect:/pets-list";
	}
	
	@RequestMapping(value="/pet-details")
	public String carDetails(@RequestParam int id,ModelMap model) {
		model.addAttribute("pet",service.detailsPet(id));
		return "owner-details";
	}
}


