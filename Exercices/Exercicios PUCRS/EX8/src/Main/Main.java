package Main;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Carro c = new Carro();
		
		System.out.println("========================================");
		System.out.println("Ligar o carro?(1 ou 0)");
		System.out.println("========================================");
		int o = scan.nextInt();
		
		if(o == 0) {
			System.exit(0);
		}
		
		while(true) {
			
			System.out.println("========================================");
			System.out.println("1 - Imprimir info");
			System.out.println("2 - Abastecer");
			System.out.println("3 - Andar");
			System.out.println("0 - Desligar carro");
			System.out.println("========================================");
			int op = scan.nextInt();
			
			if(op == 0) {
				break;
			}else if(op == 1) {
				c.imprimirInfo();
			}else if(op == 2) {
				System.out.println("Informe a quantidade de gasolina(em litros):");
				int g = scan.nextInt();
				
				c.abastecer(g);
			}else if(op == 3) {
				System.out.println("Informe a distancia(em km):");
				int k = scan.nextInt();
				
				c.mover(k);
			}
		}
		
		scan.close();

	}

}
