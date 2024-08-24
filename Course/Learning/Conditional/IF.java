import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int age;
		
		System.out.println("Enter your age:");
		age = scanner.nextInt();
		
		if(age > 0 && age < 21) {
			
			System.out.println("You are not of age");
			
		}else if(age > 21) {
			
			System.out.println("You are of age");
			
		}else {
			
			System.out.println("Invalid");
			
		}
		
		scanner.close();
		
	}

}
