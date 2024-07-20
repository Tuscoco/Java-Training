package Main;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
			
			RandomAccessFile arq = new RandomAccessFile("teste2.txt","rw");
			
			arq.writeBytes("Esse é um pequeno teste\n");
			arq.writeBytes("Testando quebra de linha\n");
			
			arq.seek(0);
			
			System.out.println(arq.readByte());
			System.out.println(arq.readByte());
			
			arq.seek(0);
			
			String linha;
			
			while((linha = arq.readLine()) != null) {
				System.out.println(linha);
			}
			
			arq.close();

		
		scan.close();

	}

}
