package entities;

import java.io.IOException;

public class Produto {

	private String name;
	private double price;
	private int quantity;
	
	
	public Produto() {
		name = "";
		price = 0.0;
		quantity = 0;
	}
	
	public void setName(String name) {
		
		try {
			
			if(name.isEmpty()) {
				throw new IOException("Nome invalido!!!");
			}
			
			this.name = name;
			
		}catch(IOException e) {
			e.getMessage();
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		
		try {
			
			if(price < 0) {
				throw new IOException("Valor invalido!!!");
			}
			
			this.price = price;
			
		}catch(IOException e) {
			e.getMessage();
		}
		
	}
	
	public void setQuantity(int quantity) {
		
		try {
			
			if(quantity < 0) {
				throw new IOException("Quantidade invalida!!!");
			}
			
			this.quantity = quantity;
			
		}catch(IOException e) {
			e.getMessage();
		}
		
	}
	
	public void cadastrarProduto(String name,double price,int quantity) {
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}
	
	public double totalValueInStock() {
		return quantity * price;
	}
	
	public void addProducts(int q) {
		
		try {
			
			if(q <= 0) {
				throw new IOException("Valor invalido!!!");
			}
			
			quantity += q;
			
		}catch(IOException e) {
			e.getMessage();
		}
		
	}
	
	public void removeProducts(int q) {
		
		try {
			
			if(q <= 0 || q > quantity) {
				throw new IOException("Valor invalido!!!");
			}
			
			quantity -= q;
			
		}catch(IOException e) {
			e.getMessage();
		}
		
	}
	
	public String productData() {
		
		return "Product Data: " + price + ", " + quantity + ", Total: " + totalValueInStock();
		
	}
	
}
