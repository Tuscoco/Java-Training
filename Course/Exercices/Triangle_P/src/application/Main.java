package application;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double xA,xB,xC,yA,yB,yC;
		
		System.out.println("Enter the measures of triangle X: ");
		xA = scan.nextDouble();
		xB = scan.nextDouble();
		xC = scan.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = scan.nextDouble();
		yB = scan.nextDouble();
		yC = scan.nextDouble();
		
		double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		double p2 = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p2 * (p2 - yA) * (p2 - yB) * (p2 - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			
			System.out.println("Larger area: X");
			
		}else {
			
			System.out.println("Larger area: Y");
			
		}
		
		scan.close();

	}

}
