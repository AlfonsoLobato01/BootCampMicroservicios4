package Ejemplos;

import java.util.List;

public class HasRedLambda {

	public static void main(String[] args) {

		List<String> colors = List.of("blue", "red", "green", "white");

		System.out.println("Tiene rojo? " + colors.contains("red"));
	}

}
