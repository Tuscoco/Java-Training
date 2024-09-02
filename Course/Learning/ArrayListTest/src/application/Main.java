package application;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<String> array = new ArrayList<>();
		
		array.add("Tusca");
		array.add("Cinema");
		array.add("Cavalo");
		array.add("Guguto");
		
		for(String x : array) {
			
			System.out.println(x);
			
		}
		
		scan.close();

	}

}
