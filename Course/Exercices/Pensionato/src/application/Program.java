package application;
import entities.Person;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Person[] rooms = new Person[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = scan.nextInt();
		
		for(int i = 0;i < n;i++) {
			
			System.out.println("Rent #" + (i + 1) + ": ");
			
			scan.nextLine();
			
			System.out.print("Name: ");
			String name = scan.nextLine();
			
			System.out.print("Email: ");
			String email = scan.nextLine();
			
			System.out.print("Room: ");
			int room = scan.nextInt();
			
			rooms[room] = new Person(name,email);
			
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0;i < rooms.length;i++) {
			
			if(rooms[i] != null) {
				
				System.out.println(i + ": " + rooms[i].toString());
				
			}
			
		}
		
		scan.close();

	}

}
