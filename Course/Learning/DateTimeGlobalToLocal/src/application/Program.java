package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.parse("2024-09-22");
		LocalDateTime d2 = LocalDateTime.parse("2024-09-22T10:20:10");
		Instant d3 = Instant.parse("2024-09-22T10:20:00Z");
		
		LocalDate res1 = LocalDate.ofInstant(d3, ZoneId.systemDefault());
		LocalDateTime res2 = LocalDateTime.ofInstant(d3, ZoneId.systemDefault());
		LocalDateTime res3 = LocalDateTime.ofInstant(d3, ZoneId.of("Portugal"));
		
		//System.out.println(res1);
		//System.out.println(res2);
		//System.out.println(res3);
		
		System.out.println("d1 dia: " + d1.getDayOfMonth());
		System.out.println("d1 mes: " + d1.getMonthValue());
		System.out.println("d1 ano: " + d1.getYear());
		
		System.out.println();
		System.out.println();
		
		System.out.println("d2 segundos: " + d2.getSecond());
		System.out.println("d2 minutos: " + d2.getMinute());
		System.out.println("d2 horas: " + d2.getHour());

	}

}
