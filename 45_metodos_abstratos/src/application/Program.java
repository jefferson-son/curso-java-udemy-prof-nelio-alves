package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of shapes: ");
		int n = scanner.nextInt();

		List<Shape> shapes = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Shape #" + (i + 1) + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			scanner.nextLine();
			char typeShape = scanner.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = scanner.next();
			// Color color = Color.valueOf(scanner.next());

			if (typeShape == 'r') {
				System.out.print("Width: ");
				double width = scanner.nextDouble();
				System.out.print("Height: ");
				double height = scanner.nextDouble();

				shapes.add(new Rectangle(Color.valueOf(color), width, height));
			} 
			else if (typeShape == 'c') {
				System.out.print("Radius: ");
				double radius = scanner.nextDouble();

				shapes.add(new Circle(Color.valueOf(color), radius));
			}

			System.out.println();
		}

		System.out.println("SHAPE AREAS: ");
		for (Shape shape : shapes) {
			System.out.printf("%.2f%n",shape.area());
		}

		scanner.close();
	}

}
