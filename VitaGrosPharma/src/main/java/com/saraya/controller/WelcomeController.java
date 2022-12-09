package com.saraya.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")

public class WelcomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome(ModelMap model ) {
		model.put("username", getLoggedInUserName());
		return "welcome-page";
	}

	public String  getLoggedInUserName() {
		Object principal=SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(principal instanceof UserDetails)
			return ((UserDetails) principal ).getUsername();
		return principal.toString();
	}

	
}
