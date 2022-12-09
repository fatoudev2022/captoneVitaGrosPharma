package com.saraya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.saraya.service.VetService;
@Controller
public class VetController {

	@Autowired 
	VetService vetService;
	@RequestMapping (value="vet-list", method=RequestMethod.GET)
	public String retrievAllVet(ModelMap model) {
		model.addAttribute("vets", vetService.getAllVet());
		return "vet-list";
	}
}
