
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x,y,op;
		
		System.out.println("Enter a number:");
		x = scanner.nextInt();
		System.out.println("Enter another number:");
		y = scanner.nextInt();
		
		System.out.println("1. +\n2. -\n3. /\n4. *");
		op = scanner.nextInt();
		
		switch(op) {
		
		case 1:
			System.out.println(x+y);
			break;
		case 2:
			System.out.println(x-y);
			break;
		case 3:
			System.out.println(x/y);
			break;
		case 4:
			System.out.println(x*y);
			break;
		default:
			System.out.println("Invalid");
			break;
		}

	}

}
