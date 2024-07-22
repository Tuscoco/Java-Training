package Main;

public class Televisao {
	
	private int canal;
	private int volume;
	private int totalCanais;
	
	
	public Televisao() {
		canal = 1;
		totalCanais = 10;
		volume = 50;
	}
	
	public void aumentarVolume() {
		try {
			
			if(volume == 100) {
				throw new IllegalArgumentException("Volume máximo!");
			}
			
			volume += 5;
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
	
	public void diminuirVolume() {
		try {
			
			if(volume == 0) {
				throw new IllegalArgumentException("Volume zerado!");
			}
			
			volume -= 5;
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
	
	public void canalMais() {
		try {
			
			if(canal == totalCanais) {
				throw new IllegalArgumentException("Ultimo canal!");
			}
			
			canal++;
			
		}catch(IllegalArgumentException e){
			System.out.println("Erro! " + e.getMessage());
		}
	}
	
	public void canalMenos() {
		try {
			
			if(canal == 1) {
				throw new IllegalArgumentException("Primeiro canal!");
			}
			
			canal--;
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
	
	public void mudarCanal(int c) {
		try {
			
			if(c <= 0 || c > totalCanais) {
				throw new IllegalArgumentException("Canal não existente!");
			}
			
			canal = c;
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
	
	public int getCanal() {
		return canal;
	}
	
	public int getTotalCanais() {
		return totalCanais;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void imprimirInfo() {
		System.out.println("========================================");
		System.out.println("Total de Canais: " + getTotalCanais());
		System.out.println("Canal: " + getCanal());
		System.out.println("Volume: " + getVolume());
		System.out.println("========================================");
		//imprimirVolume();
	}
	
	public void imprimirVolume() {
		int v = getVolume();
		int i = 0;
		
		System.out.println("=================VOLUME=================");
		for(i = 0; i <= v;i++) {
			
			if(v % 2 == 0 && v != 0) {
				System.out.print("*");
			}
		}
		System.out.println("");
		System.out.println("========================================");
	}
	
}
