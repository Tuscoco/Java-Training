package application;
import entities.Produto;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static Produto[] addProducts(Produto[] array,Produto novoProduto) {
		
		Produto[] novoArray = Arrays.copyOf(array, array.length + 1);
		
		novoArray[novoArray.length - 1] = novoProduto;
		
		return novoArray;
		
	}
	
	public static void imprimirProdutosCadastrados(Produto[] produtos) {
		
		for(int i = 0;i < produtos.length;i++) {
			
			System.out.println(i + " - " + produtos[i].getName());
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Produto produto[] = new Produto[0];
		
		System.out.println("====================GERENCIAMENTO=DE=ESTOQUE====================");
		System.out.println("Gostaria de iniciar o programa?(1 or 0)");
		System.out.println("================================================================");
		int op = scan.nextInt();
		
		while(op != 0) {
			
			System.out.println("================================================================");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Adicionar produtos");
			System.out.println("3 - Remover produtos");
			System.out.println("4 - Imprimir informacoes");
			System.out.println("0 - Encerrar programa");
			System.out.println("================================================================");
			int es = scan.nextInt();
			
			if(es == 0) {
				
				op = 0;
				
			}else if(es == 1) {
				
				produto = addProducts(produto, new Produto());
				
				System.out.println("Informe o valor do produto:");
				double valor = scan.nextDouble();
				
				System.out.println("Informe a quantidade em estoque:");
				int qnt = scan.nextInt();
				
				scan.nextLine();
				
				System.out.println("Informe o nome do produto:");
				String nome = scan.nextLine();
				
				produto[produto.length - 1].cadastrarProduto(nome, valor, qnt);
				
				System.out.println("Produto cadastrado com sucesso!!!");
				
			}else if(es == 2) {
				
				System.out.println("De qual produto?");
				imprimirProdutosCadastrados(produto);
				int pro = scan.nextInt();
				
				while(pro < 0 || pro >= produto.length) {
					
					System.out.println("Produto inexistente! Informe outro!");
					pro = scan.nextInt();
					
				}
				
				System.out.println("Informe a quantidade a ser adicionada:");
				int qnt = scan.nextInt();
				
				produto[pro].addProducts(qnt);
				
			}else if(es == 3) {
				
				System.out.println("De qual produto?");
				imprimirProdutosCadastrados(produto);
				int pro = scan.nextInt();
				
				while(pro < 0 || pro >= produto.length) {
					
					System.out.println("Produto inexistente! Informe outro!");
					pro = scan.nextInt();
					
				}
				
				System.out.println("Informe a quantidade a ser removida:");
				int qnt = scan.nextInt();
				
				produto[pro].removeProducts(qnt);
				
			}else if(es == 4) {
				
				System.out.println("De qual produto?");
				imprimirProdutosCadastrados(produto);
				int pro = scan.nextInt();
				
				while(pro < 0 || pro >= produto.length) {
					
					System.out.println("Produto inexistente! Informe outro!");
					pro = scan.nextInt();
					
				}
				
				System.out.println(produto[pro].productData());
				
			}
			
		}
		
		scan.close();

	}

}
