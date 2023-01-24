import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;
		do {
			System.out.print("Digite uma temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			double Fahrenheit = celsius * 1.8 + 32;

			System.out.println("Equivalente em Fahrenheit: " + Fahrenheit);
			System.out.print("Deseja repetir (s/n)? ");

			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();
	}
}
