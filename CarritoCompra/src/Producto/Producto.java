package Producto;

import java.math.BigDecimal;



public class Producto {
	public String name;
	public BigDecimal price;
	public Tax tax;

	Producto(String name, BigDecimal price, Tax tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
}
