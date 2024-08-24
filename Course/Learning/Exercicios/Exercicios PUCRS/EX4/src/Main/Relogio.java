package Main;

public class Relogio {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Relogio() {
		hora = 00;
		minuto = 00;
		segundo = 00;
	}
	
	public Relogio(int h, int m, int s) {
		hora = h;
		minuto = m;
		segundo = s;
	}
	
	public void setHora(int hora, int minuto, int segundo) {
		
		try {
			
			if((hora < 0 || minuto < 0 || segundo < 0) || (minuto >= 60 || segundo >= 60)) {
				throw new IllegalArgumentException("HORÁRIO INVÁLIDO!!!");
			}
			
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = segundo;
			
		}catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
			System.exit(0);
		}
	}
	
	public Relogio getHora() {
		Relogio w = new Relogio(hora,minuto,segundo);
		return w;
	}
	
	public void avancar() {
		
		segundo += 5;
		
		if(segundo >= 60) {
			segundo -= 60;
			minuto++;
			
			if(minuto >= 60) {
				minuto -= 60;
				hora++;
			}
		}
		
	}
	
	public void imprimirInfo() {
		Relogio sla = getHora();
		System.out.println("==========================================");
		System.out.println(sla.hora + ":" + sla.minuto + ":" + sla.segundo);
		System.out.println("==========================================");
	}
	
}
