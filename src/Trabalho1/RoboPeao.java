package Trabalho1;

public class RoboPeao extends Robo{

	public RoboPeao() {
		super();
		this.nome = "Peao";
		this.id = 2;
	}

	
	public String mostrar() {
		return "P";
	}
	
	public void avancar(int numCelulas) {
		posicaoX++;
	}
	
	public void retroceder(int numCelulas) {
		posicaoX--;
	}
}
