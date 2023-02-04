package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		LocalDate day04 = LocalDate.parse("2023-02-02");
		LocalDateTime day05 = LocalDateTime.parse("2023-02-02T11:50:05");
		Instant day06 = Instant.parse("2023-02-02T11:50:05Z");

		// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

		System.out.println("day04 = " + day04.format(fmt1));
		System.out.println("day04 = " + fmt1.format(day04));
		System.out.println("day04 = " + day04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.println();

		System.out.println("day05 = " + day05.format(fmt1));
		System.out.println("day05 = " + day05.format(fmt2));
		System.out.println("day05 = " + day05.format(fmt4));

		System.out.println();

		System.out.println("day06 = " + fmt3.format(day06));
		System.out.println("day06 = " + fmt5.format(day06));
		System.out.println("day06 = " + day06.toString());

	}

}
