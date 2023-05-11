package com.nttdata.bootcamp.webfluxservermicro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.webfluxservermicro.persona.Persona;

import reactor.core.publisher.Flux;

@RestController
public class ServerController {
	
	@GetMapping("/personlist-1")
	public Flux<Persona> personList1(){
        Flux<Persona> personas = Flux.just(
                new Persona("Juan", "Ramirez", 30)

        );
        
        return personas;

		
	}
	
	@GetMapping("/personlist-2")
	public Flux<Persona> personList2(){
        Flux<Persona> personas = Flux.just(
                new Persona("Alfonso", "Lobato", 26)

        );
        
        return personas;

		
	}
	
	@GetMapping("/personlist-3")
	public Flux<Persona> personList3(){
        Flux<Persona> personas = Flux.just(
                new Persona("Maria", "Fernandez", 25)

        );
        
        return personas;

		
	}
	
	@GetMapping("/personlist-4")
	public Flux<Persona> personList4(){
        Flux<Persona> personas = Flux.just(
                new Persona("Pedro", "Martinez", 20)

        );
        
        return personas;

		
	}
	
	
	
}


