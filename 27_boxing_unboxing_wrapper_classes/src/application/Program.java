package application;

public class Program {

	public static void main(String[] args) {

		int x = 20;
		// Objeto referência recebe uma variável.
		Object obj = x;
		
		System.out.println(obj);
		
		// Um variável recebe um objeto referência. Adicionando casting devido aos tipos diferentes.
		int y = (int) obj;
		
		System.out.println(y);

	}

}
