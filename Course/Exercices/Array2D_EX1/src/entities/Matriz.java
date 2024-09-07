package entities;

import java.util.Scanner;

public class Matriz {

	private int linhas;
	private int colunas;
	private int[][] matriz;
	
	
	public Matriz(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.matriz = new int[linhas][colunas];
	}
	
	public void procurar(int num) {
		
		for(int i = 0;i < linhas;i++) {
			
			for(int j = 0;j < colunas;j++) {
				
				if(matriz[i][j] == num) {
					
					mostrar(i, j);
					
				}
				
			}
			
		}
		
	}
	
	public void preencherMatriz() {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Preencha a matriz: ");
		
		for(int i = 0;i < linhas;i++) {
			
			for(int j = 0;j < colunas;j++) {
				
				matriz[i][j] = scan.nextInt();
				scan.nextLine();
				
			}
			
			scan.nextLine();
			
		}
		
	}
	
	public void mostrar(int i,int j) {
		
		System.out.println("Position: " + i + " , " + j);
		
		if((j - 1) >= 0) {
			System.out.println("Left: " + matriz[i][j - 1]);
		}
		
		if((j + 1) < colunas) {
			System.out.println("Right: " + matriz[i][j + 1]);
		}
		
		if((i - 1) >= 0) {
			System.out.println("Up: " + matriz[i - 1][j]);
		}
		
		if((i + 1) < linhas) {
			System.out.println("Down: " + matriz[i + 1][j]);
		}
		
		System.out.println();
		System.out.println();
		
	}
	
}
