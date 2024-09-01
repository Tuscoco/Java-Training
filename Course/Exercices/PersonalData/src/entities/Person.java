package entities;

public class Person {
	
	private char gender;
	private double height;
	
	
	public Person(char gender, double height) {
		this.gender = gender;
		this.height = height;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
