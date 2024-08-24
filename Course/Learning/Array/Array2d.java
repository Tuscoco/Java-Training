
import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int l;
		
		System.out.print("Informe o numero de linhas e colunas da matriz quadrada: ");
		l = scanner.nextInt();
		
		int[][] matriz;
		matriz = new int[l][l];
		
		System.out.print("Informe o numero que ira ficar na diagonal principal: ");
		int num = scanner.nextInt();
		
		for(int i = 0;i < l;i++){
			for(int j = 0;j < l;j++){
				if(i == j){
					matriz[i][j] = num;
				}else{
					matriz[i][j] = 0;
				}
			}
		}
		
		
		for(int i = 0;i < matriz.length;i++){
			
			System.out.print("||");
			
			for(int j = 0;j < matriz[i].length;j++){
				
				System.out.print(matriz[i][j] + "||");
				
			}
			
			System.out.println(" ");
		}
		
		matriz = null;

	}

}
