import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int x = sc.nextInt();
		int sumNumbers = 0;

		while (x != 0) {
			sumNumbers += x;
			System.out.println("Digite novamente: ");
			x = sc.nextInt();
			
		}
		
		System.out.println("Soma dos números: " + sumNumbers);
		sc.close();
	}

}
