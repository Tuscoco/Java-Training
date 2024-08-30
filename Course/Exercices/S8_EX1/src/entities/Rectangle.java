package entities;

import java.io.IOException;

public class Rectangle {
	
	private double width;
	private double height;
	
	
	public Rectangle() {
		width = 0.0;
		height = 0.0;
	}
	
	public void setWidth(double width) {
		
		try {
			
			if(width <= 0) {
				throw new IOException("Tamanho invalido!!!");
			}
			
			this.width = width;
			
		}catch(IOException e) {
			e.getMessage();
		}
		
	}
	
	public void setHeight(double height) {
		
		try {
			
			if(height <= 0) {
				throw new IOException("Tamanho invalido!!!");
			}
			
			this.height = height;
			
		}catch(IOException e) {
			e.getMessage();
		}
		
	}
	
	public void setSides(double width,double height) {
		setWidth(width);
		setHeight(height);
	}
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (2 * width) + (2 * height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return "AREA: " + area() + " , PERIMETRO: " + perimeter() + " , DIAGONAL: " + diagonal();
	}

}
