package application;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many numbers are you going to type? ");
		int n = scan.nextInt();
		double sum = 0.0;
		
		double[] array = new double[n];
		
		for(int i = 0;i < array.length;i++) {
			
			System.out.print("Enter a number: ");
			array[i] = scan.nextDouble();
			
			sum += array[i];
			
		}
		
		System.out.println("VALUES = ");
		for(int i = 0;i < array.length;i++) {
			
			System.out.print(array[i] + " ");
			
		}
		
		System.out.println();
		System.out.println("SUM = " + sum);
		System.out.println("MEDIA = " + sum/n);
		
		scan.close();

	}

}
