package Main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		File arq = new File("Teste.txt");
		
		try {
			
			if(arq.createNewFile()) {
				System.out.println("Arquivo criado com sucesso!");
			}else {
				System.out.println("Arquivo já existe!");
			}
		}catch(IOException e) {
			System.out.println("Erro ao abrir o arquivo!");
			e.printStackTrace();
		}
		
		System.out.println("Escreva uma frase: ");
		String frase = scan.nextLine();
		
		try {
			FileWriter escrever = new FileWriter("Teste.txt");
			
			escrever.write(frase);
			escrever.close();
			
			System.out.println("Escrito!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Scanner leitor = new Scanner(arq);
			String linhas = new String();
			
			while(leitor.hasNext()) {
				linhas = leitor.nextLine();
				
				System.out.println(linhas);
			}
			
			leitor.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		scan.close();

	}

}
