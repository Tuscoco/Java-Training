package Main;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Circulo c1 = new Circulo();
		
		System.out.println("Informe o valor do raio:");
		double r = scan.nextDouble();
		
		c1.setRaio(r);
		
		System.out.println("Informe as coordenadas do centro(x,y):");
		double xx = scan.nextDouble();
		double yy = scan.nextDouble();
		
		c1.setCentro(xx, yy);
		
		while(true) {
			
			System.out.println("=======================================");
			System.out.println("1 - Imprimir info");
			System.out.println("2 - Aumentar raio");
			System.out.println("0 - Encerrar programa");
			System.out.println("=======================================");
			int op = scan.nextInt();
			
			if(op == 0) {
				break;
			}else if(op == 1) {
				c1.imprimirInfo();
			}else if(op == 2) {
				System.out.println("Informe o percentual de aumento:");
				double p = scan.nextDouble();
				c1.aumentar(p);
			}
			
		}
		
		scan.close();

	}

}
