package com.tecsup.javawebavanzado.sesion04.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ejercicio2")
public class Mapeo2Controller {

	private static final Logger logger = LoggerFactory.getLogger(Mapeo2Controller.class);

	@RequestMapping(method = RequestMethod.GET)
	public Map<String, String> obtenerCategoria(@RequestParam(value = "id", required = false, defaultValue = "-1" ) Integer id) {

		logger.info("id: " + id);
		HashMap<String, String> persona = new HashMap<String, String>();
		persona.put("categoria", "Libros - Caso 1");
		persona.put("id", "" + id);

		return persona;
	}

	@RequestMapping(value = "/caso2", method = RequestMethod.GET)
	public Map<String, String> obtenerCategoriaCaso2(@RequestParam Integer id) {

		logger.info("id: " + id);
		HashMap<String, String> persona = new HashMap<String, String>();
		persona.put("categoria", "Libros - Caso 2");
		persona.put("id", "" + id);

		return persona;
	}

	@GetMapping("/caso3")
	public String obtenerCategoriaCaso3(@RequestParam Integer id, Model model) {

		logger.info("id: " + id);
		model.addAttribute("categoria", "Libros - Caso 3 ");
		model.addAttribute("id", "" + id);

		return "ejercicio2";
	}

}
