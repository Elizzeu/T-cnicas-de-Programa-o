package Trabalho1;

public class RoboCavalo extends Robo{

	public RoboCavalo() {
		super();
		this.nome = "Cavalo";
		this.id = 5;
	}

	
	public String mostrar() {
		return "C";
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