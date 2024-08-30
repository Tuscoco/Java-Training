package application;
import java.util.*;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account holder: ");
		String accountHolder = scan.nextLine();
		
		System.out.print("Enter account number: ");
		int accountNumber = scan.nextInt();
		
		System.out.println("Is there an initial deposit (y/n)? ");
		char op = scan.next().charAt(0);
		
		if(op == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			double value = scan.nextDouble();
			
			account = new Account(accountNumber,accountHolder,value);
			
		}else {
			
			account = new Account(accountNumber,accountHolder);
			
		}
		
		System.out.println("Account Data:");
		System.out.println("Account " + account.getAccountNumber() + ", Holder: " + account.getAccountHolder() + ", Balance: $ " + account.getBalance());
		
		System.out.print("Enter a deposit value: ");
		double value = scan.nextDouble();
		account.deposit(value);
		
		System.out.println("Updated account data:");
		System.out.println("Account " + account.getAccountNumber() + ", Holder: " + account.getAccountHolder() + ", Balance: $ " + account.getBalance());
		
		System.out.print("Enter a withdraw value: ");
		value = scan.nextDouble();
		account.withdraw(value);
		
		System.out.println("Updated account data:");
		System.out.println("Account " + account.getAccountNumber() + ", Holder: " + account.getAccountHolder() + ", Balance: $ " + account.getBalance());
		
		scan.close();

	}

}
