package Main;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Relogio r1 = new Relogio();
		
		System.out.println("Informe um horario:");
		int ho = scan.nextInt();
		int mi = scan.nextInt();
		int se = scan.nextInt();
		
		r1.setHora(ho, mi, se);
		
		while(true) {
			
			System.out.println("==========================================");
			System.out.println("1 - Imprimir info");
			System.out.println("2 - Avançar 5 segundos");
			System.out.println("0 - Encerrar programa");
			System.out.println("==========================================");
			int op = scan.nextInt();
			
			if(op == 0) {
				break;
			}else if(op == 1) {
				r1.imprimirInfo();
			}else if(op == 2) {
				r1.avancar();
			}
			
		}
		
		scan.close();

	}

}
