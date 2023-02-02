package application;

public class Program {

	public static void main(String[] args) {

		String[] names = new String[] { "Maria", "José", "Jesus", "Joao" };

		// for each
		for (String nomes : names) {
			System.out.println(nomes);
		}
		
		System.out.println("===============");
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}
}
