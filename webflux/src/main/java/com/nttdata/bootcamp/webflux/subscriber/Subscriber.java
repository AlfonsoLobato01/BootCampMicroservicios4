package com.nttdata.bootcamp.webflux.subscriber;

public class Subscriber {
	
	public static void imprimir(Integer n) {
		
		try {
			Thread.sleep(5000);
		}catch (Exception e) {
			e.getStackTrace();
		}
		System.out.println("Subscriptor 1 " + n);
	}

}
