package com.nttdata.bootcamp.webfluxappmicro.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.nttdata.bootcamp.webfluxappmicro.persona.Persona;

import reactor.core.publisher.Flux;

@Service
public class PersonService {
	
	public Flux<Persona> allPersonas(){
		
		Flux<Persona> personas1 = WebClient.create("http://localhost:8080/personlist-1").get().retrieve().bodyToFlux(Persona.class);
		Flux<Persona> personas2 = WebClient.create("http://localhost:8080/personlist-2").get().retrieve().bodyToFlux(Persona.class);
		Flux<Persona> personas3 = WebClient.create("http://localhost:8080/personlist-2").get().retrieve().bodyToFlux(Persona.class);
		Flux<Persona> personas4 = WebClient.create("http://localhost:8080/personlist-4").get().retrieve().bodyToFlux(Persona.class);
		
		Flux<Persona> allPersonas = Flux.merge(personas1, personas2, personas3, personas4);
		
		return allPersonas;
	}

}
