package com.saraya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.saraya.service.VisitService;
@Controller
public class VisitController {
@Autowired
		private VisitService service;
		
		@RequestMapping(value="/page-visit")
		public String getAllPets(ModelMap model){
			model.addAttribute("visits",service.showVisit());
			return "page-visit";
		}
}
