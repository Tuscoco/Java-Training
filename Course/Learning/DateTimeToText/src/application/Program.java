package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.parse("2024-09-22");
		LocalDateTime d2 = LocalDateTime.parse("2024-09-22T09:50:00");
		//LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.parse("2024-09-22T09:50:00Z");//Londres
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//É preciso especificar o fuso horário
		
		System.out.println("d1: " + d1.format(fmt1));
		//System.out.println("d1: " + fmt1.format(d1));
		//System.out.println("d1: " + d1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		//System.out.println("d2: " + d2.format(fmt1));
		System.out.println("d2: " + d2.format(fmt2));
		//System.out.println(dd.compareTo(d2));
		
		System.out.println("d3: " + fmt3.format(d3));

	}

}
