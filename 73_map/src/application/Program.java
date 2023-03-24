package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.00);
		Product p2 = new Product("Notebook", 1500.00);
		Product p3 = new Product("Tablet", 400.00);
		
		stock.put(p1, 10000.00);
		stock.put(p2, 12000.00);
		stock.put(p3, 15000.00);
		
		Product p = new Product("Notebook", 1500.00);
		
		System.out.println("Stock possui 'ps' no conjunto: " + stock.containsKey(p));
		System.out.println("Quantidade de elementos no conjunto stock: " + stock.size());
		
		stock.remove(p3);
		
		System.out.println("Quantidade de elementos no conjunto stock: " + stock.size());
		
		
		for (Product map : stock.keySet()) {
			System.out.println(map);
		}
		
		stock.clear();
		
		System.out.println("Quantidade de elementos no conjunto stock: " + stock.size());
	}

}
