package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> products = new ArrayList<>();
		
		
		products.add(new Product("Tv", 1200.00));
		products.add(new Product("Notebook", 2500.00));
		products.add(new Product("Tablet", 400.00));
		
		// Implementação da interface(Comparator) com uma Expressão Lâmbda / Arrow Function / Função anônima.
		/*Comparator<Product> comp = (p1, p2) -> {
			return p1.getPrice().compareTo(p2.getPrice());
		};*/
		
		
		//Implementação da interface(Comparator) com uma Expressão Lâmbda / Arrow Function / Função anônima em uma única linha.
		/*Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());*/
		
		
		//Expressão Lâmbda / Arrow Function / Função anônima dentro do sort de forma limpa e resumida
		//Comparator definido com a sintaxe de expressão lambda
		
		products.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product p : products) {
			System.out.println(p);
		}

	}

}
