package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsourced = scanner.next().charAt(0);
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Hours: ");
			int hours = scanner.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = scanner.nextDouble();

			if (outsourced == 'y') {
				System.out.print("Additional charge: ");
				double addtionalCharge = scanner.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, addtionalCharge));
			} 
			else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
			
			System.out.println();
		}
		
		System.out.println("PAYMENTS: ");
		for (Employee emp : employees) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		scanner.close();
	}

}
