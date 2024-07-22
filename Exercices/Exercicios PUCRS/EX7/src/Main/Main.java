package Main;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArCondicionado ac = new ArCondicionado();
		
		System.out.println("Informe a temperatura:");
		double t = scan.nextDouble();
		
		ac.setTemp(t);
		
		while(true) {
			
			System.out.println("=============================================");
			System.out.println("1 - Imprimir info");
			System.out.println("2 - Aumentar potencia");
			System.out.println("3 - Diminuir potencia");
			System.out.println("0 - Encerrar programa");
			System.out.println("=============================================");
			int op = scan.nextInt();
			
			if(op == 0) {
				break;
			}else if(op == 1) {
				ac.imprimirInfo();
			}else if(op == 2){
				ac.aumentarPotencia();
			}else if(op == 3) {
				ac.diminuirPotencia();
			}
			
		}
		
		scan.close();

	}

}
