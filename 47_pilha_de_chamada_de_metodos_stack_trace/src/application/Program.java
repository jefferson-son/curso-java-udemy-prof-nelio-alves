package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		method1();

		System.out.println("End of program");

	}

	public static void method1() {
		System.out.println("***** START METHOD 1 *****");

		method2();

		System.out.println("*****  END METHOD 1  *****");
	}

	public static void method2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("***** START METHOD 2 *****");
		try {
			String[] vect = scanner.nextLine().split(" ");
			int position = scanner.nextInt();
			System.out.println(vect[position]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			e.printStackTrace();
			scanner.next();
		}

		catch (InputMismatchException e) {
			System.out.println("Invalid input type");
		}

		System.out.println("*****  END METHOD 2  *****");
		scanner.close();
	}

}
