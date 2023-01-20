import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Lendo uma String.
		String x;
		x = sc.next();

		System.out.println("Você digitou o valor: " + x);
		System.out.println("-------------");

		// Lendo um Inteiro.
		int y;
		y = sc.nextInt();

		System.out.println("Você digitou o valor: " + y);
		System.out.println("-------------");

		// Lendo um Double.
		double z;
		z = sc.nextDouble();

		System.out.println("Você digitou o valor: " + z);
		System.out.println("-------------");

		// Lendo um caractere.
		char a;
		a = sc.next().charAt(0);

		System.out.println("Você digitou o valor: " + a);
		System.out.println("-------------");

		// Lendo varios dados na mesma linha.
		String c;
		int d;
		double e;
		c = sc.next();
		d = sc.nextInt();
		e = sc.nextDouble();

		System.out.println("Dados digitados: ");
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		

		sc.close();
	}

}
