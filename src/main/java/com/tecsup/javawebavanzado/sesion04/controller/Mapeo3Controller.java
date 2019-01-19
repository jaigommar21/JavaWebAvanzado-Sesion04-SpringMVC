package com.tecsup.javawebavanzado.sesion04.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ejercicio3")
public class Mapeo3Controller {

	private static final Logger logger = LoggerFactory.getLogger(Mapeo3Controller.class);

	@RequestMapping(value="/{nombre}", method = RequestMethod.GET)
	public String mostrarNombre(@PathVariable("nombre") String nombre, Model model) {
				
		logger.info("Nombre: " + nombre);
		
		model.addAttribute("mensaje", nombre);
		
		return "ejercicio3";
	}
	
		
	@GetMapping("/caso2/{nombre}/{apPaterno}/{apMaterno}")
	public String mostrarNombreCaso2(
			@PathVariable String nombre, 
			@PathVariable String apPaterno, 
			@PathVariable String apMaterno, 
			Model model) {
				
		logger.info("Nombre: " + nombre);
		logger.info("Apellido Paterno: " + apPaterno);
		logger.info("Apellido Materno: " + apMaterno);
		
		model.addAttribute("mensaje", apPaterno + " " + apMaterno + ", " + nombre);
		
		return "ejercicio3";
	}


}
