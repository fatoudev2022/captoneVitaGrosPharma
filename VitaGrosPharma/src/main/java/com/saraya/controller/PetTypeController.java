package com.saraya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saraya.service.PetTypeService;

@Controller
public class PetTypeController {
	@Autowired
	private PetTypeService petTypeService;
	@RequestMapping(value="/petType-list")
	public String getAllPetType(ModelMap model){
		model.addAttribute("petTypes",petTypeService.getAllPetType());
		return "petType-list";
	}
}
