package entities;

public class Triangle {

	private double a;
	private double b;
	private double c;
	private double area;
	
	
	public Triangle() {
		
		a = 0.0;
		b = 0.0;
		c = 0.0;
		
	}
	
	public void setSides(double a,double b,double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
		calcArea();
		
	}
	
	public void calcArea() {
		
		double p = (a + b + c) / 2;
		
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
	}
	
	public double getArea() {
		return area;
	}
	
}
