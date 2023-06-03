package Trabalho1;

public class RoboTorre extends Robo{

	
	public RoboTorre() {
		super();
		this.nome = "Torre";
		this.id = 3;
	}

	
	public String mostrar() {
		return "T";
	}
	
	public void avancar(int numCelulas) {
		posicaoY+=numCelulas;
	}
	
	public void retroceder(int numCelulas) {
		posicaoY-=numCelulas;
	}
}
