package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Integer> array = new ArrayList<>();
		
		array.add(10000);
		array.add(null);
		
		System.out.println(array.get(1));
		
		scan.close();

	}

}
