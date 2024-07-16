package Main;
import Main.Funcs;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Funcs funcs = new Funcs();
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int fat;
		
		do{
			System.out.print("Informe um numero maior que 1: ");
			num = scanner.nextInt();
		}while(num < 1);
		
		fat = funcs.fatorial(num);
		
		System.out.println("O fatorial de " + num + " eh: " + fat);
		
		scanner.close();
		
	}

}
