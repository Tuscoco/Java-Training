package application;
import entities.Employee;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Enter a name: ");
		String name = scan.nextLine();
		employee.setName(name);
		
		System.out.print("Enter a Gross Salary: ");
		double s = scan.nextDouble();
		employee.setGrossSalary(s);
		
		System.out.print("Enter a tax: ");
		s = scan.nextDouble();
		employee.setTax(s);
		
		
		System.out.println();
		System.out.println("Employee: " + employee.toString());
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		s = scan.nextDouble();
		
		employee.increaseSalary(s);
		
		System.out.println();
		System.out.println("Updated data: " + employee.toString());
		System.out.println();
		
		scan.close();

	}

}
