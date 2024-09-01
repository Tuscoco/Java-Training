package application;
import java.util.*;
import entities.Person;

public class Program {

	public static double mediaM(Person[] array) {
		
		double media = 0.0;
		int num = 0;
		
		for(int i = 0;i < array.length;i++) {
			
			if(array[i].getGender() == 'F') {
				
				num++;
				
				media += array[i].getHeight();
				
			}
			
		}
		
		return (media/num);
		
	}
	
	public static int numH(Person[] array) {
		
		int num = 0;
		
		for(int i = 0;i < array.length;i++) {
			
			if(array[i].getGender() == 'M') {
				
				num++;
				
			}
			
		}
		
		return num;
		
	}
	
	public static void swap(double[] array,int i,int j) {
		
		double temp = array[j];
		array[j] = array[i];
		array[i] = temp;
		
	}
	
	public static void ordenar(double[] array) {
		
		for(int i = 0;i < (array.length - 1);i++) {
			
			int menor = i;
			
			for(int j = (i + 1);j < (array.length);j++) {
				
				if(array[menor] > array[j]) {
					menor = j;
				}
				
			}
			
			swap(array,i,menor);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int quant = scan.nextInt();
		
		Person[] pessoas = new Person[quant];
		double[] alturas = new double[quant];
		
		for(int i = 0;i < quant;i++) {
			
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double alt = scan.nextDouble();
			
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			char gen = scan.next().charAt(0);
			
			pessoas[i] = new Person(gen,alt);
			alturas[i] = pessoas[i].getHeight();
			
		}
		
		ordenar(alturas);
		
		System.out.println("Menor altura = " + alturas[0]);
		System.out.println("Maior altura = " + alturas[(alturas.length - 1)]);
		System.out.println("Media das alturas das mulheres = " + mediaM(pessoas));
		System.out.println("Numero de homens = " + numH(pessoas));
		
		scan.close();

	}

}
