package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		LocalDate day04 = LocalDate.parse("2023-07-20");
		LocalDateTime day05 = LocalDateTime.parse("2023-02-02T11:50:05");
		Instant day06 = Instant.parse("2022-07-20T01:30:05Z");

		LocalDate pastWeekLocalDate = day04.minusDays(7);
		LocalDate nextWeekLocalDate = day04.plusDays(7);

		LocalDateTime pastWeekLocalDateTime = day05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = day05.plusDays(7);
		Instant pastWeekInstant = day06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = day06.plus(7, ChronoUnit.DAYS);

		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

		System.out.println();

		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

		System.out.println();

		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		System.out.println("========= DURAÇÃO DE HORA =========");
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), day04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, day05);
		Duration t3 = Duration.between(pastWeekInstant, day06);
		Duration t4 = Duration.between(day06, pastWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());

	}

}
