package application;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
		
		list.add("Tusca");
		list.add("Cavalo");
		list.add("Cinema");
		list.add("Guguto");
		list.add("Leleo");
		
		for(String x : list) {
			
			System.out.println(x);
			
		}
		
		System.out.println(list.size());
		
		System.out.println();
		System.out.println();
		
		//list.remove(2);
		//list.remove("Guguto");
		//list.removeIf(x -> x.charAt(0) != 'C');
		
		for(String x : list) {
			
			System.out.println(x);
			
		}
		
		System.out.println();
		System.out.println();
		
		//System.out.println("Index of Leleo: " + list.indexOf("Leleo"));
		//System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println();
		System.out.println();
		
		String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
		
		System.out.println(name);
		
		scan.close();

	}

}
