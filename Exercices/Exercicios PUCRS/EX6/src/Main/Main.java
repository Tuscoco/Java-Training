package Main;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Televisao tv = new Televisao();
		
		System.out.println("========================================");
		System.out.println("Gostaria de ligar a televisão?(1 ou 0)");
		System.out.println("========================================");
		int l = scan.nextInt();
		
		if(l == 0) {
			System.exit(0);
		}
		
		while(true) {
			
			System.out.println("========================================");
			System.out.println("1 - Imprimir info");
			System.out.println("2 - Aumentar canal");
			System.out.println("3 - Diminuir canal");
			System.out.println("4 - Escolher canal");
			System.out.println("5 - Aumentar volume");
			System.out.println("6 - Diminuir volume");
			System.out.println("0 - Desligar televisão");
			System.out.println("========================================");
			int op = scan.nextInt();
			
			if(op == 0) {
				break;
			}else if(op == 1) {
				tv.imprimirInfo();
			}else if(op == 2) {
				tv.canalMais();
			}else if(op == 3) {
				tv.canalMenos();
			}else if(op == 4) {
				System.out.println("Encolha um canal:");
				int ca = scan.nextInt();
				
				tv.mudarCanal(ca);
			}else if(op == 5) {
				tv.aumentarVolume();
			}else if(op == 6) {
				tv.diminuirVolume();
			}
		}
		
		scan.close();

	}

}
