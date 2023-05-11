package com.nttdata.bootcamp.webfluxappmicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nttdata.bootcamp.webfluxappmicro.persona.Persona;
import com.nttdata.bootcamp.webfluxappmicro.service.PersonService;

import reactor.core.publisher.Flux;

@Controller
public class appController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/person-list")
	public String personList(final Model model) {
		 final Flux<Persona> personlist = personService.allPersonas();
		 model.addAttribute("personlist", personlist);
		 return "personlist";
	}
	
	

}
