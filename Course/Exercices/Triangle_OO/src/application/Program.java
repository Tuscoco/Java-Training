package application;
import java.util.*;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		double n1,n2,n3;
		
		System.out.println("Enter the measures of triangle X: ");
		
		n1 = scan.nextDouble();
		n2 = scan.nextDouble();
		n3 = scan.nextDouble();
		
		t1.setSides(n1, n2, n3);
		
		System.out.println("Enter the measures of triangle Y: ");
		
		n1 = scan.nextDouble();
		n2 = scan.nextDouble();
		n3 = scan.nextDouble();
		
		t2.setSides(n1, n2, n3);
		
		
		System.out.println("Triangle X area: " + t1.getArea());
		System.out.println("Triangle Y area: " + t2.getArea());
		
		if(t1.getArea() > t2.getArea()) {
			
			System.out.println("X");
			
		}else {
			
			System.out.println("Y");
			
		}
		
		scan.close();

	}

}
