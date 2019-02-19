package auxiliares;

public class Tomar {
	
	private int qtd;
	
	public Tomar(int qtd) {//Construtor da classe
		super();
		this.qtd = qtd;
	}
	
	public void beber() {
		System.out.println("Restam " + this.qtd + " cerveja(s) no freezer");
		System.out.println("Passa uma pra frente");
	}
	
}
