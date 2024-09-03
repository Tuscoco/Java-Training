package application;
import entities.Person;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Person> list = new ArrayList<Person>();
		
		System.out.print("Informe quantos funcionarios serao digitados: ");
		int n = scan.nextInt();
		
		scan.nextLine();
		for(int i = 0;i < n;i++) {
			
			System.out.println("Empregado #" + (i + 1) + ":");
			
			System.out.print("Nome: ");
			String name = scan.nextLine();
			
			System.out.print("Id: ");
			int id = scan.nextInt();
			
			System.out.print("Salario: ");
			double salary = scan.nextDouble();
			
			list.add(new Person(id, name, salary));
			
		}
		
		System.out.print("Informe o id do funcionario que tera o salario aumentado: ");
		int id = scan.nextInt();
		Integer index = null;
		
		for(int i = 0;i < n;i++) {
			
			if(list.get(i).getId() == id) {
				
				index = i;
				
			}
			
		}
		
		if(index == null) {
			
			System.out.println("Esse id nao existe!!!");
			
		}else {
			
			System.out.print("Infome a porcentagem: ");
			int perc = scan.nextInt();
			
			list.get(index).setSalary(perc);
			
		}
		
		System.out.println("Lista de empregados: ");
		
		for(Person x : list) {
			
			System.out.println(x.toString());
			
		}
		
		scan.close();

	}

}
