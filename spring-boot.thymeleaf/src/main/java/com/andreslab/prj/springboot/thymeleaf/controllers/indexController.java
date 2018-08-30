package com.andreslab.prj.springboot.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

	@Value("${application.controllers.titulo}")
	private String titulo;
	@GetMapping("/")
	public String hola(Model model) {
		model.addAttribute("mensaje", titulo);
		return "hola"; //debe retornar el nombre de la vista
	}
}
