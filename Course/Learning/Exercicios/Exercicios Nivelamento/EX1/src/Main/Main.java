package Main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do array: ");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Preencha o array:");
		for(int i = 0; i < size;i++) {
			
			System.out.print("Elemento " + i + ": ");
			array[i] = scan.nextInt();
			
		}
		
		System.out.print("Informe um numero: ");
		int num = scan.nextInt();
		
		boolean bool = Funcs.VerificarArray(array, num);
		
		if(bool) {
			System.out.println("O numero " + num + " esta presente no array!");
		}else {
			System.out.println("O numero " + num + " NAO esta presente no array!");
		}
		
		scan.close();

	}

}
