package com.arquitecturajva.tito.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HolaController {

	@RequestMapping("/hola")
	public String hola() {
		
		return "hola";
	}
	
	@GetMapping("/formularioEditar")
	public String formularioEditar(Model modelo ,@RequestParam int id) {
		
		System.out.println(id);
		String mensaje="";
		if (id==1) {
			mensaje="hola";
		}else {
			mensaje="adios";
		}
		modelo.addAttribute("mensaje", mensaje);
		
		return "formularioEditar";
		
		
	}
}
