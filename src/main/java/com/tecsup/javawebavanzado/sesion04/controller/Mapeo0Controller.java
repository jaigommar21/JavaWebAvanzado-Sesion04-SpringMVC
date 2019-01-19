package com.tecsup.javawebavanzado.sesion04.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mapeo0Controller {

	private static final Logger logger = LoggerFactory.getLogger(Mapeo0Controller.class);

	@GetMapping("/ejercicio0")
	protected ModelAndView inicio() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd 'de' MMMMM 'de' yyyy");
		String fecha = sdf.format(new Date());

		return new ModelAndView("ejercicio0", "fecha", fecha);
	}

	@PostMapping("/ejercicio0")
	protected ModelAndView login(HttpServletRequest request) throws Exception {

		logger.info("Usuario: " + request.getParameter("idUsuario"));
		logger.info("Clave: " + request.getParameter("clave"));

		return new ModelAndView("ejercicio0", "mensaje", "Bienvenido al Sistema :" + request.getParameter("idUsuario"));
	}

}
