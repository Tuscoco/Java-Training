package Main;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe seu nome:");
		String name = scanner.nextLine();
		
		boolean con = name.equalsIgnoreCase("leonardo");
		
		if(con){
			System.out.println("VIADO");
		}else{
			System.out.println("HOMEM");
		}
		
		scanner.close();

	}

}
