package com.saraya.controller;

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
import com.saraya.service.OwnerService;

@Controller
public class OwnerController {
	@Autowired
	OwnerService ownerService;
	@RequestMapping(value="/list-Owner", method=RequestMethod.GET)
	public String retriveOwners(ModelMap model) {
		model.addAttribute("owners", ownerService.getAllOwners());
		return "list-Owner";
		
	}
	
	@RequestMapping(value="/add-owner", method=RequestMethod.GET)
	public String addOwner(ModelMap model) {
		model.addAttribute("owners", new Owner());
		return "add-owner";
	}
	
	@RequestMapping(value="/add-owner", method=RequestMethod.POST)
	public String addedOwner(@Valid @ModelAttribute("owners") Owner owner, BindingResult result) {
		if(result.hasErrors()) {
			return "add-owner";
		}
		ownerService.addOwner(owner.getFirstName(), owner.getLastName(), owner.getAddress(), owner.getCity(), owner.getTelephone());
		return "redirect:/list-Owner";
	}
	
	@RequestMapping(value="/update-owner", method=RequestMethod.GET)
	public String updateOwner(@RequestParam int id,ModelMap model) {
		model.addAttribute("owners", ownerService.detailsOwner(id));
		return "add-owner";
	}
	

	@RequestMapping(value="/update-owner", method=RequestMethod.POST)
	public String updatedOwner(@Valid Owner owner, BindingResult result) {
		if(result.hasErrors()) {
			return "add-owner";
			
		}
		ownerService.updateOwner(owner);
		return "redirect:/list-Owner";

	
}
	
	@RequestMapping(value="/delete-owner", method=RequestMethod.GET)
	public String delOwner(@RequestParam int id) {
		ownerService.deleteOwner(id);
		return "redirect:/list-Owner";
	}
	
	@RequestMapping(value="/owner-details")
	public String carDetails(@RequestParam int id,ModelMap model) {
		model.addAttribute("owner",ownerService.detailsOwner(id));
		return "owner-details";
	}
}
