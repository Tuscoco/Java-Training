package Main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Preencha o vetor:");
		for(int i = 0;i < size;i++) {
			
			System.out.println("Elemento " + i + ": ");
			array[i] = scan.nextInt();
			
		}
		
		Funcs.MaiorEMenor(array);
		
		scan.close();

	}

}
