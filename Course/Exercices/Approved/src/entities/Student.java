package entities;

public class Student extends Person{

	private boolean approved;
	private double n1;
	private double n2;
	private double media;
	
	
	public Student(String name,double n1, double n2) {
		super(name);
		this.n1 = n1;
		this.n2 = n2;
	}


	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public void media() {
		media = (n1 + n2)/2;
	}
	
	public double getMedia() {
		media();
		
		return media;
	}
	
	public String getName() {
		return name;
	}
	
}
