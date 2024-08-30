package entities;

import java.io.IOException;

public class Employee {

	private String name;
	private double grossSalary;
	private double tax;
	
	
	public Employee() {
		name = "";
		grossSalary = 0.0;
		tax = 0.0;
	}
	
	public void setName(String name) {
		
		try {
			
			if(name.isEmpty()) {
				throw new IOException("Invalid name!!!");
			}
			
			this.name = name;
			
		}catch(IOException e) {
			e.getMessage();
		}
		
	}
	
	public void setGrossSalary(double grossSalary) {
		
		try {
			
			if(grossSalary <= 0) {
				throw new IOException("Invalid gross salary!!!");
			}
			
			this.grossSalary = grossSalary;
			
		}catch(IOException e) {
			e.getMessage();
		}
		
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public void increaseSalary(double percent) {
		
		try {
			
			if(percent < 0) {
				throw new IOException("Invalid percent!!!");
			}
			
			grossSalary += grossSalary * (percent / 100);
			
		}catch(IOException e) {
			e.getMessage();
		}
		
	}
	
	public String toString() {
		return name + ", $ " + (grossSalary - tax);
	}
	
}
