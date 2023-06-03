package Trabalho1;

public class RoboRei extends Robo{

	public RoboRei() {
		super();
		this.nome = "Rei";
		this.id = 6;
	}

	
	public String mostrar() {
		return "R";
	}
	
	public void avancar(int numCelulas) {
		posicaoY+=numCelulas;
		posicaoX+=numCelulas;
	}
	
	public void retroceder(int numCelulas) {
		posicaoY+=numCelulas;
		posicaoX-=numCelulas;
	}
}