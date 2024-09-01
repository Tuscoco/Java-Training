package application;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many numbers are you going to type? ");
		int n = scan.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0;i < array.length;i++) {
			
			System.out.print("Enter a number: ");
			array[i] = scan.nextInt();
			
		}
		
		System.out.println("NEGATIVE NUMBERS:");
		for(int i = 0; i < array.length;i++) {
			
			if(array[i] < 0) {
				
				System.out.println(array[i]);
				
			}
			
		}
		
		scan.close();

	}

}
