package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.parse("2024-09-22");
		LocalDateTime d2 = LocalDateTime.parse("2024-09-22T10:20:10");
		Instant d3 = Instant.parse("2024-09-22T10:20:00Z");
		
		LocalDate pastWeek = d1.minusDays(7);
		LocalDate nextWeek = d1.plusDays(7);
		
		System.out.println(pastWeek);
		System.out.println(nextWeek);
		
		System.out.println();
		System.out.println();
		
		LocalDateTime pastWeekH = d2.minusDays(7);
		LocalDateTime nextWeekH = d2.plusDays(7);
		
		System.out.println(pastWeekH);
		System.out.println(nextWeekH);
		
		System.out.println();
		System.out.println();
		
		Instant pastWeekI = d3.minus(7, ChronoUnit.DAYS);
		Instant nextWeekI = d3.plus(7, ChronoUnit.DAYS);
		
		System.out.println(pastWeekI);
		System.out.println(nextWeekI);
		
		System.out.println();
		System.out.println();
		
		
		
		//DURAÇÃO
		
		Duration t1 = Duration.between(pastWeekH, nextWeekH);
		
		System.out.println(t1.toDays());

	}

}
