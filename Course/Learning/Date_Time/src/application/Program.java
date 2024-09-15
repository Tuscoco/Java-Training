package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		
		LocalDateTime d02 = LocalDateTime.now();
		
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-09-14");
		LocalDateTime d05 = LocalDateTime.parse("2024-09-14T23:16:45");
		
		Instant d06 = Instant.parse("2024-09-14T23:16:45Z");
		Instant d07 = Instant.parse("2024-09-14T23:16:45-03:00");
		
		LocalDate d08 = LocalDate.parse("14/09/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("14/09/2024 23:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate d10 = LocalDate.of(2024, 9, 14);
		LocalDateTime d11 = LocalDateTime.of(2024, 9, 14, 23, 30);
		
		
		
		System.out.println("D01 = " + d01);
		System.out.println("D02 = " + d02);
		System.out.println("D03 = " + d03);
		System.out.println("D04 = " + d04);
		System.out.println("D05 = " + d05);
		System.out.println("D06 = " + d06);
		System.out.println("D07 = " + d07);
		System.out.println("D08 = " + d08);
		System.out.println("D09 = " + d09);
		System.out.println("D10 = " + d10);
		System.out.println("D11 = " + d11);

	}

}
