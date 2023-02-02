package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		
		
		// Instanciação
		// (agora) ➞ Data-hora
		LocalDate day01 = LocalDate.now();
		LocalDateTime day02 = LocalDateTime.now();
		Instant day03 = Instant.now();

		// Conversão texto ISO8601 para data-hora
		LocalDate day04 = LocalDate.parse("2023-02-02");
		LocalDateTime day05 = LocalDateTime.parse("2023-02-02T11:50:05");
		Instant day06 = Instant.parse("2023-02-02T11:50:05Z");
		Instant day07 = Instant.parse("2023-02-02T11:50:05-03:00");
		
		// Texto formato customizado ➞ Data-hora
		// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate day08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime day09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		// dia, mês, ano, [horário] ➞ Data-hora loca
		LocalDate day10 = LocalDate.of(2022, 7, 20);
		LocalDateTime day11 = LocalDateTime.of(2022, 7, 20, 13, 30);
		
		
		System.out.println("================ INSTANCIAMENTO =================");
		System.out.println("Data local: " + day01);
		System.out.println("Data local com hora: " + day02);
		System.out.println("Data com hora e fuso horário de Londres: " + day03);

		System.out.println();

		System.out.println("======= CONVERSÃO ISO8601 PARA DATA-HORA ========");
		System.out.println("Conversão data local: " + day04);
		System.out.println("Conversão data e hora local: " + day05);
		System.out.println("Conversão data e hora com fuso horário de Londres: " + day06);
		System.out.println("Conversão data e hora com fuso horário local para Londres: " + day07);
		
		System.out.println();

		System.out.println("====== TEXTO FORMATO CUSTOMIZADO DATA-HORA =======");
		System.out.println("Formatação data local: " + day08);
		System.out.println("Formatação data e hora local: " + day09);
		
		System.out.println();

		System.out.println("=== TEXTO FORMATO CUSTOMIZADO ANO-MÊS-DIA-HORA ====");
		System.out.println("Formatação data local: " + day10);
		System.out.println("Formatação data e hora local: " + day11);

	}

}
