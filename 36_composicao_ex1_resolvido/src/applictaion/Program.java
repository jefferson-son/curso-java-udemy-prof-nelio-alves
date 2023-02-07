package applictaion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String departmentName = scanner.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = scanner.nextLine();
		System.out.print("Level: ");
		String workerLevel = scanner.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = scanner.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		System.out.print("How many contracts to this worker? ");
		int contractsNumber = scanner.nextInt();

		for (int i = 0; i < contractsNumber; i++) {
			System.out.println("Enter contract #" + (i + 1) + " data: ");
			System.out.print("Date(DD/MM/YYYY): ");
			LocalDate date = LocalDate.parse(scanner.next(), dateFormat);

			// LocalDate dateFormated = LocalDate.parse(date, dateFormat);

			System.out.print("Value per hour: ");
			double valuePerHour = scanner.nextDouble();
			System.out.print("Duration (hours): ");
			int durationHours = scanner.nextInt();

			HourContract contract = new HourContract(date, valuePerHour, durationHours);
			worker.addContract(contract);

			System.out.println();
		}

		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = scanner.next();

		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));

		scanner.close();

	}

}
