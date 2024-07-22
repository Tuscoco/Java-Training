package Main;

public class ArCondicionado {
	
	private int potencia;
	private double tempIn;
	private double tempEx;
	
	
	public ArCondicionado() {
		potencia = 0;
		tempIn = 0;
		tempEx = 0;
	}
	
	public void setTemp(double temp) {
		tempIn = temp;
		tempEx = temp;
	}
	
	public void aumentarPotencia() {
		try {
			
			if(potencia == 10) {
				throw new IllegalArgumentException("Potencia máxima!");
			}
			
			potencia++;
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
	
	public void diminuirPotencia() {
		try {
			
			if(potencia == 0) {
				throw new IllegalArgumentException("Ar condicionado desligado!");
			}
			
			potencia--;
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
	
	public double getTempEx() {
		return tempEx;
	}
	
	public double getTempIn() {
		
		tempIn = tempEx - (potencia * 1.8);
		
		return tempIn;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	public void imprimirInfo() {
		
		System.out.println("=============================================");
		System.out.println("Potencia: " + getPotencia());
		System.out.println("Temperatura Interna: " + getTempIn() + "c");
		System.out.println("Temperatura Externa: " + getTempEx() + "c");
		System.out.println("=============================================");
	}
}
