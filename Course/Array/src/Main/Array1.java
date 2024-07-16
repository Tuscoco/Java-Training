package Main;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int tam;
		int imp,par;
		
		System.out.print("Informe o tamanho do vetor:");
		tam = scanner.nextInt();
		
		int[] array = new int[tam];
		
		System.out.print("Informe o numero que irá ficar nas posições impares:");
		imp = scanner.nextInt();
		System.out.print("Informe o numerk que irá ficar nas posições pares:");
		par = scanner.nextInt();
		
		for(int i = 0;i < tam;i++) {
			
			if(i % 2 == 0){
				array[i] = par;
			}else{
				array[i] = imp;
			}
		}
		
		for(int i = 0;i < tam;i++) {
			System.out.print(array[i] + "||");
		}
		
		scanner.close();
		array = null;

	}

}
