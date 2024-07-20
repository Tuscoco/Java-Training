
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double x,y,h;
		
		System.out.println("Enter side x:");
		x = scanner.nextDouble();
		
		System.out.println("Enter side y:");
		y = scanner.nextDouble();
		
		h = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		System.out.println("The hypotenuse is: " + h);
		
		scanner.close();

	}

}
