package Main;

public class Circulo {
	
	private double raio;
	private double area;
	private double circunferencia;
	private double x,y;
	
	
	public Circulo() {
		raio = 0.0;
		area = 0.0;
		circunferencia = 0.0;
		x = 0.0;
		y = 0.0;
	}
	
	public Circulo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setRaio(double raio) {
		try {
			
			if(raio < 0) {
				throw new IllegalArgumentException("O raio não pode ser negativo");
			}
			
			this.raio = raio;
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
	
	public void aumentar(double perc) {
		try {
			
			if(perc < 0) {
				throw new IllegalArgumentException("O percentual não pode ser negativo");
			}
			
			perc /= 100;
			double aumento = raio * perc;
			
			raio += aumento;
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
	
	public void setCentro(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Circulo getCentro() {
		Circulo c = new Circulo(x,y);
		return c;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public double getArea() {
		area = Math.PI * raio * raio;
		return area;
	}
	
	public double getCircunferencia() {
		circunferencia = 2 * Math.PI * raio;
		return circunferencia;
	}
	
	public void imprimirInfo() {
		Circulo d = getCentro();
		System.out.println("=======================================");
		System.out.println("Coordenada: (" + d.x + "," + d.y + ")");
		System.out.println("Raio: " + getRaio());
		System.out.println("Area: " + getArea());
		System.out.println("Circunferencia: " + getCircunferencia());
		System.out.println("=======================================");
	}
}
