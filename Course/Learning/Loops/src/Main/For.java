package Main;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n,i;
		int result = 1;
		
		System.out.println("Informe um numero:");
		n = scanner.nextInt();
		
		for(i = 1; i <= n; i++) {
			result *= i;
		}
		
		System.out.println("O fatorial de " + n + " eh " + result);
		
		scanner.close();

	}

}
