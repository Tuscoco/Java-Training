package Main;

public class Funcs {
	
	public static void MaiorEMenor(int[] arr) {
		
		int i;
		int maior,menor;
		
		maior = arr[0];
		menor = arr[0];
		
		for(i = 0;i < arr.length;i++) {
			
			if(menor > arr[i]) {
				menor = arr[i];
			}
			
			if(maior < arr[i]) {
				maior = arr[i];
			}
			
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
	}
	
}