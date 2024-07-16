package Main;

public class Funcs {
	public int fatorial(int n) {
		
		if(n == 1){
			return 1;
		}
		
		return n * fatorial(n - 1);
	}
}
