package Main;
import java.util.Scanner;

class Pessoa{
	
	private String nome;
	private int idade;
	private double altura;
	
	
	public Pessoa() {
		nome = "nameless";
		idade = 1;
		altura = 1.0;
	}
	
	public void setNome(String nome) {
		try {
			
			if(nome.isEmpty()) {
				throw new IllegalArgumentException("O nome não pode ser vazio.");
			}
			
			this.nome = nome;
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}
	
	public void setIdade(int idade) {
		try {
			
			if(idade < 0) {
				throw new IllegalArgumentException("A idade não pode ser menor que 0.");
			}
			
			this.idade = idade;
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro " + e.getMessage());
		}
		
	}
	
	public void setAltura(double altura) {
		try {
			
			if(altura <= 0) {
				throw new IllegalArgumentException("A altura não pode ser 0 ou menor.");
			}
			
			this.altura = altura;
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void imprimirInfo() {
		
		System.out.println("==============================");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Altura: " + getAltura());
		System.out.println("==============================");
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		
		System.out.println("=================PESSOA=================");
		System.out.println("Gostaria de iniciar o programa?");
		System.out.println("========================================");
		int op = scan.nextInt();
		
		if(op == 0) {
			System.exit(0);
		}
		
		while(true) {
			
			System.out.println("==============================");
			System.out.println("1 - Imprimir info");
			System.out.println("2 - Cadastrar pessoa");
			System.out.println("0 - Encerrar programa");
			System.out.println("==============================");
			int opc = scan.nextInt();
			
			if(opc == 0) {
				break;
			}else if(opc == 1) {
				p1.imprimirInfo();
			}else if(opc == 2) {
				
				System.out.println("Informe o nome: ");
				String n = scan.nextLine();
				n = scan.nextLine();
				
				System.out.println("Informe a idade: ");
				int i = scan.nextInt();
				scan.nextLine();
				
				System.out.println("Informe a altura: ");
				double a = scan.nextDouble();
				scan.nextLine();
				
				p1.setNome(n);
				p1.setIdade(i);
				p1.setAltura(a);
				
			}
			
		}
		
		scan.close();

	}

}
