package Main;

public class Funcs {
	
	public static boolean VerificarArray(int[] arr, int n) {
		
		int i;
		
		for(i = 0;i < arr.length;i++) {
			
			if(arr[i] == n) {
				return true;
			}
			
		}
		
		return false;
	}
	
}
