package application;
import java.util.*;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many persons are you going to type? ");
		int n = scan.nextInt();
		double sum = 0.0;
		int p = 0;
		
		Person[] persons = new Person[n];
		
		for(int i = 0;i < persons.length;i++) {
			
			System.out.println("Person " + (i + 1));
			
			System.out.print("Name: ");
			String name = scan.nextLine();
			
			scan.nextLine();
			
			System.out.print("Age: ");
			int age = scan.nextInt();
			
			System.out.print("Height: ");
			double height = scan.nextDouble();
			
			persons[i] = new Person(name,age,height);
			
			sum += persons[i].getHeight();
			
			if(persons[i].getAge() < 16) {
				p++;
			}
			
		}
		
		System.out.println("MEDIA: " + (sum/n));
		System.out.println("PERSONS UNDER 16 YEARS OF AGE: " + ((n/100)*p));
		
		for(int i = 0;i < p;i++) {
			
			if(persons[i].getAge() < 16) {
				
				System.out.println(persons[i].getName());
				
			}
			
		}
		
		scan.close();

	}

}
