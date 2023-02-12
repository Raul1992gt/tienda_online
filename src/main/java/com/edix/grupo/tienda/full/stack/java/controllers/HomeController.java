package com.edix.grupo.tienda.full.stack.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	/*
	 * @Autowired
	 * 	
	 * @Autowired
	 */
	
	@GetMapping("/inicio")
	public String verTodos() {
		
		return "index";
		
	}

}
