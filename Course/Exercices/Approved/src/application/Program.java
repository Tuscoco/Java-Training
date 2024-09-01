package application;
import entities.*;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = scan.nextInt();
		Student[] alunos = new Student[n];
		
		for(int i = 0;i < alunos.length;i++) {
			
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
			
			scan.nextLine();
			String name = scan.nextLine();
			
			double n1 = scan.nextInt();
			double n2 = scan.nextInt();
			
			alunos[i] = new Student(name,n1,n2);
			
		}
		
		for(int i = 0;i < alunos.length;i++) {
			
			if(alunos[i].getMedia() >= 6) {
				alunos[i].setApproved(true);
			}
			
			if(alunos[i].isApproved()) {
				System.out.println(alunos[i].getName());
			}
			
		}
		
		scan.close();

	}

}
