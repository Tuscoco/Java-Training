package Main;

public class Carro {
	
	private int combustivel;
	private int  distancia;
	
	
	public Carro() {
		combustivel = 0;
		distancia = 0;
	}
	
	public void abastecer(int gasolina) {
		try {
			
			if(gasolina > 50 || combustivel + gasolina > 50) {
				throw new IllegalArgumentException("Quantidade de gasolina não suportada!");
			}
			
			combustivel += gasolina;
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
	
	public void mover(int km) {
		try {
			
			if(km > (combustivel * 15) || combustivel - (km/15) < 0) {
				throw new IllegalArgumentException("Gasolina insuficiente!");
			}
			
			distancia += km;
			combustivel -= (km/15);
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
	
	public int getCombustivel() {
		return combustivel;
	}
	
	public int getDistancia() {
		return distancia;
	}
	
	public void imprimirInfo() {
		
		System.out.println("========================================");
		System.out.println("Combustivel: " + getCombustivel() + "L");
		System.out.println("Distancia: " + getDistancia() + "Km");
		System.out.println("========================================");
		
	}
}
