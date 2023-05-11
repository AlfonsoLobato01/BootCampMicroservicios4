package com.nttdata.bootcamp.webflux.controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.webflux.subscriber.Subscriber;

import reactor.core.publisher.Flux;

@RestController
public class WebFluxController {
	
	@GetMapping(path="/numbers", produces="text/event-stream")
	public Flux<Integer> numbers(){
		
		Flux<Integer> flux =  Flux.range(1, 30).delayElements(Duration.ofSeconds(1));
		
		flux.subscribe(n -> Subscriber.imprimir(n));
		flux.subscribe(n -> System.out.println("Subscriptor 2: " + n));
		
		return flux;
	}

}
