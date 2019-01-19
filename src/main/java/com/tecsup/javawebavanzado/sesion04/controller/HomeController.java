package com.tecsup.javawebavanzado.sesion04.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String index(Model model) {
		//model.addAttribute("message", "Hello Spring MVC 5!");
		return "index";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	@GetMapping("/abc")
	public String index(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	
	// @RequestMapping(value = "/pares", method = RequestMethod.GET)
	@GetMapping("/pares")
	public String obtenerNroPares(Locale locale, Model model) {
		
		logger.info("Obtencion de numeros pares", locale);		
		String cadNroPares = "0 2 4 6 8 10 12";		
		model.addAttribute("nroPares", cadNroPares );		
		return "pares";
	}	
	
	//@RequestMapping(value = "/impares", method = RequestMethod.GET)
	@GetMapping("/impares")
	public String obtenerNroImpares(Locale locale, Model model) {
		
		logger.info("Obtencion de numeros pares", locale);		
		String cadNroImpares = "1 3 5 7 9 11 13";		
		model.addAttribute("nroImpares", cadNroImpares );		
		return "impares";
	}
	
}
