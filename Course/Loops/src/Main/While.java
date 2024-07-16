package Main;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		int n,result;
		
		System.out.println("Informe um numero:");
		n = scanner.nextInt();
		
		while(i != 11) {
			result = i * n;
			
			System.out.println(i + " * " + n + " = " + result);
			
			i++;
		}
		
		scanner.close();

	}

}
