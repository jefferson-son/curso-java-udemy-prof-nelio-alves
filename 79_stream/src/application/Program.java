package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3,4,5,10,7);
		
		// Criação de uma Stream a partir de uma coleção
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		// Criação de uma Stream com Stream.Of passando os valores por argumento
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));

		// Criação de uma Stream com o Stream.iterator com uma operação intermediária e uma operação terminal
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		// Sequência de Fibonacci em Stream
		Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L}, x -> new Long[]{x[1], x[0] + x[1]}).map(x -> x[0]);
		System.out.println(Arrays.toString(st4.limit(20).toArray()));
	}

}
