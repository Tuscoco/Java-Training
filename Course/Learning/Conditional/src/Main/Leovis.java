package Main;
import java.util.Scanner;

public class Leovis {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		String nome = scanner.nextLine();
		
		if(nome.equals("Leonardo") || nome.equals("leonardo")) {
			System.out.println("VIADO");
		}else {
			System.out.println("Homem");
		}
		
		scanner.close();

	}

}
