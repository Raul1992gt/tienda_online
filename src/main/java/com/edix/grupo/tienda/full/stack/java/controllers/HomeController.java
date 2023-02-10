package com.edix.grupo.tienda.full.stack.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	/*
	 * @Autowired
	 * 	
	 * @Autowired
	 */
	
	@GetMapping("/")
	public String verTodos(Model model) {
		
		return null;
		
	}

}
