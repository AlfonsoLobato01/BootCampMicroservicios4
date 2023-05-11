package com.nttdata.bootcamp.reactor;

import reactor.core.publisher.Flux;

/**
 * 
 * @author alobatol
 *
 */
public class App {
    public static void main( String[] args )    {
    	
        Flux<String> messagePublisher = Flux.just("Hola ", "Mundo", "BootCamp", "Microservicios");

        
        
        // Consumidor 1
        messagePublisher.subscribe(m -> System.out.println("Consumidor 1 : Recibido. " + m),
        		e -> System.out.println("Consumidor 1 : Error" + e.getMessage()),
        		() -> System.out.println("Consumidor 1 : Completado" ));
        		
        		
        // Consumidor 2
        messagePublisher.subscribe(m -> System.out.println("Consumidor 2 : Recibido. " + m),
                		e -> System.out.println("Consumidor 2 : Error" + e.getMessage()),
                		() -> System.out.println("Consumidor 2 : Completado" ));
        
        
       
        
    }
}
