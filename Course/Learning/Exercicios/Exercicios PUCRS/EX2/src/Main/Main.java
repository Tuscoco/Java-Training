package Main;
import java.util.Scanner;

class Elevador{
	
	private int andar;
	private int totalAndares;
	private int capacidade;
	private int pessoas;
	
	public Elevador() {
		andar = 0;
		totalAndares = 0;
		capacidade = 0;
		pessoas = 0;
	}
	
	public void inicializa(int totalAndares,int capacidade) {
		try {
			
			if(totalAndares <= 0 || capacidade <= 0) {
				throw new IllegalArgumentException("Valor inválido!");
			}
			
			this.totalAndares = totalAndares;
			this.capacidade = capacidade;
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void entra() {
		
		if(capacidade == 0) {
			System.out.println("Elevador lotado!");
		}else {
			pessoas++;
			capacidade--;
		}
		
	}
	
	public void sai() {
		
		if(pessoas ==  0) {
			System.out.println("Elevador vazio!");
		}else {
			pessoas--;
			capacidade++;
		}
		
	}
	
	public void sobe() {
		
		if(andar == totalAndares) {
			System.out.println("No ultimo andar!");
		}else {
			andar++;
		}
		
	}
	
	public void desce() {
		
		if(andar == 0) {
			System.out.println("No terreo!");
		}else {
			andar--;
		}
		
	}
	
	public int getAndar() {
		return andar;
	}
	
	public int getTotalAndares() {
		return totalAndares;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public int getPessoas() {
		return pessoas;
	}
	
	public void imprimirInfo() {
		System.out.println("============================");
		System.out.println("Andar: " + getAndar());
		System.out.println("Total de andares: " + getTotalAndares());
		System.out.println("Numero de pessoas: " + getPessoas());
		System.out.println("Capacidade: " + getCapacidade());
		System.out.println("============================");
	}
	
}

public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Elevador e1 = new Elevador();
		
		System.out.println("============SISTEMA=DO=ELEVADOR============");
		System.out.println("Gostaria de iniciar o programa?(1 ou 0)");
		System.out.println("===========================================");
		int op = scan.nextInt();
		
		if(op == 0) {
			System.exit(0);
		}
		
		System.out.print("Informe a capacidade do elevador(em pessoas): ");
		int c = scan.nextInt();
		System.out.print("Informe o numero de andares do predio: ");
		int a = scan.nextInt();
		
		e1.inicializa(a, c);
		
		while(true) {
			
			System.out.println("============================");
			System.out.println("1 - Imprimir info");
			System.out.println("2 - Adicionar pessoa");
			System.out.println("3 - Remover pessoa");
			System.out.println("4 - Subir andar");
			System.out.println("5 - Descer andar");
			System.out.println("0 - Encerrar programa");
			System.out.println("============================");
			int opc = scan.nextInt();
			
			if(opc == 0) {
				break;
			}else if(opc == 1) {
				e1.imprimirInfo();
			}else if(opc == 2) {
				e1.entra();
			}else if(opc == 3) {
				e1.sai();
			}else if(opc == 4) {
				e1.sobe();
			}else if(opc == 5) {
				e1.desce();
			}
			
		}
		
		scan.close();

	}

}
