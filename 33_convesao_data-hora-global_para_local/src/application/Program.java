package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {

		LocalDate day04 = LocalDate.parse("2023-07-20");
		LocalDateTime day05 = LocalDateTime.parse("2023-02-02T11:50:05");
		Instant day06 = Instant.parse("2022-07-20T01:30:05Z");
		
		//ZoneId.getAvailableZoneIds();
		
		LocalDate r1 = LocalDate.ofInstant(day06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(day06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(day06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(day06, ZoneId.of("Portugal"));
		
		System.out.println("Local Brasil r1 = " + r1);
		System.out.println("Local Portugal r2 = " + r2);
		System.out.println();
		System.out.println("Local Brasil r3 = " + r3);
		System.out.println("Local Portugal r4 = " + r4);
		
		System.out.println();
		
		System.out.println("day04 dia = " + day04.getDayOfMonth());
		System.out.println("day04 mês = " + day04.getMonthValue());
		System.out.println("day04 mês = " + day04.getYear());
		
		System.out.println();
		
		System.out.println("day05 hora = " + day05.getHour());
		System.out.println("day05 minuto = " + day05.getMinute());
		
		

	}

}
