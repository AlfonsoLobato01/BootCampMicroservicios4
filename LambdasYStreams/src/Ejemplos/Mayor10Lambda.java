package Ejemplos;

import java.util.List;

public class Mayor10Lambda {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

		System.out.println("Numeros mayores que 10 imperativa");
		for (int number : numbers) {
			if (number > 10) {
				System.out.println(number);
			}
		}
		
		System.out.println("Numeros mayores que 10 funcional");
		numbers.stream().filter(number -> number > 10).forEach(System.out::println);
	}

}
