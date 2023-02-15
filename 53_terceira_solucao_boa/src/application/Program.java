package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			int number = scanner.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			LocalDate checkIn = LocalDate.parse(scanner.next(), dtf);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			LocalDate checkOut = LocalDate.parse(scanner.next(), dtf);

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation" + reservation);

			System.out.println();

			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = LocalDate.parse(scanner.next(), dtf);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = LocalDate.parse(scanner.next(), dtf);

			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation" + reservation);

			scanner.close();
		}

		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}

	}

}
