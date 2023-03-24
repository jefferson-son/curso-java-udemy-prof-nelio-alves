package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Set<Product> prod = new HashSet<>();
		
		prod.add(new Product("Tv", 900.00));
		prod.add(new Product("Notebook", 1200.00));
		prod.add(new Product("Tablet", 400.00));
		
		Product otherProduct = new Product("Notebook", 1200.00);
		
		System.out.println(prod.contains(otherProduct));
	}

}
