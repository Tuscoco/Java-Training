package application;
import entities.Rectangle;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		double temp1,temp2;
		
		System.out.println("Enter rectangle width and height:");
		temp1 = scan.nextDouble();
		temp2 = scan.nextDouble();
		
		rectangle.setWidth(temp1);
		rectangle.setHeight(temp2);
		
		System.out.println(rectangle.toString());
		
		scan.close();

	}

}
