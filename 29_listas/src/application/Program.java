package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// Adição de elementos na lista.
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		// Adição de elemento em posição específica.
		list.add(2, "Marco");
		
		// Tamando da lista
		System.out.println(list.size());
		
		System.out.println("===================");
		
		// Impressão de elementos da lista com for each.
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("===================");
		
		// Remoção de elemento da lista através da comparação de valores.
		//list.remove("Anna");
		// Remoção de elemento através da posição.
		//list.remove(1);
		// Remoção de elemento através de predicado.
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("===================");
		
		// Busca da posição de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		// Busca da posição de um elemento que não existe na lista(retorna -1).
		System.out.println("Index of Jhon: " + list.indexOf("Jhon"));
		
		System.out.println("===================");
		
		// Para realizar uma filtragem de elementos, é necessário criar uma nova lista.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		// Encontrando primeiro elemento que atenda um predicado.
		System.out.println("===================");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("===================");
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2);
	}

}
