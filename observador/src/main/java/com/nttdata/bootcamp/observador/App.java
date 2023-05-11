package com.nttdata.bootcamp.observador;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 
 * @author alobatol
 *
 */


public class App 
{
    public static void main( String[] args )    {
    	
    	Observable <String> messageSender = Observable.just("Hola ", "Mundo", "BootCamp", "Microservicios");
    	
    	messageSender.subscribe(new Observer<String>() {
    		@Override
    		public void onSubscribe(Disposable d) {
    			System.out.println("Observador 1 : Suscrito");
    		}

			@Override
			public void onNext(String s) {
				
				System.out.println("Observador 1 : Recibido " + s);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Observador 1 : Error " + e.getMessage());
				
			}

			@Override
			public void onComplete() {
				System.out.println("Observador 1 : Completado");
				
			}
    	});
    	
    	messageSender.subscribe(new Observer<String>() {
    		@Override
    		public void onSubscribe(Disposable d) {
    			System.out.println("Observador 2 : Suscrito");
    		}

			@Override
			public void onNext(String s) {
				
				System.out.println("Observador 2 : Recibido " + s);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Observador 2 : Error " + e.getMessage());
				
			}

			@Override
			public void onComplete() {
				System.out.println("Observador 2 : Completado");
				
			}
    	});
    	
    	
    	
    	
        
    }
}
