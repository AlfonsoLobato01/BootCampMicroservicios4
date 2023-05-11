package Producto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ProductoMain {

	public static void main(String[] args) { 
		
		List<Producto> shopping = List.of( 
				new Producto("Clothes", new BigDecimal("15.90"), Tax.NORMAL), 
				new Producto("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED), 
				new Producto("Meat", new BigDecimal("13.99"), Tax.REDUCED), 
				new Producto("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED), 
				new Producto("Coke", new BigDecimal("1.89"), Tax.REDUCED), 
				new Producto("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
		
		
		
		
		BigDecimal totalCost = shopping.stream()
                .map(producto -> {
                    BigDecimal taxAmount = producto.price
                    		.multiply(BigDecimal.valueOf(producto.tax.getPercent()))
                    		.divide(BigDecimal.valueOf(100));
                    return producto.price.add(taxAmount);
                })
                .reduce(BigDecimal.ZERO, BigDecimal::add);


        System.out.println("El coste total de la compra es: " + totalCost);
        
        
        System.out.println("\nProductos que empiezan por C");
        
        String nombresProductos = shopping.stream()
                .filter(producto -> producto.name.startsWith("C"))
                .map(producto -> producto.name)
                .collect(Collectors.joining(", "));

        System.out.println(nombresProductos);
        
        
	
	}
	
}
		



