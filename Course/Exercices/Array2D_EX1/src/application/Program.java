package application;

import java.util.Scanner;
import entities.*;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o numero de linhas e colunas da matriz: ");
		int l = scan.nextInt(),c = scan.nextInt();
		
		Matriz matriz = new Matriz(l, c);
		
		matriz.preencherMatriz();
		
		System.out.println("Informe o numero que deseja procurar: ");
		int num = scan.nextInt();
		
		matriz.procurar(num);
		
		scan.close();
		
	}

}
