package Trabalho1;

import java.util.ArrayList;
import java.util.Random;

public class Servicos {

	private Plano plano;
	private int quantAlunos;
	private int quantBugs;

	public Servicos(Plano plano, int quantdAlunos, int quantBugs) {
		this.plano = plano;
		this.quantAlunos = quantdAlunos;
		this.quantBugs = quantBugs;
	}

	private int sortearNumero(int min, int max) {
		Random random = new Random();

		return random.nextInt((max - min) + 1) + min;
	}

	public ArrayList<int[]> sortearElementosNoPlano() {
		ArrayList<int[]> posicoesIniciais = new ArrayList<int[]>();

		for (int i = 1; i <= (this.quantAlunos + this.quantBugs); i++) {
			int[] coordenada = new int[3];

			
			coordenada[0] = sortearNumero(1, this.plano.getTamanhoX());
			coordenada[1] = sortearNumero(1, this.plano.getTamanhoY());

			
			if (i <= this.quantAlunos) {
				coordenada[2] = 1; 
			} else {
				coordenada[2] = 2;
			}

			for (int[] c : posicoesIniciais) {
				while (coordenada[0] == c[0] && coordenada[1] == c[1]) {
					coordenada[0] = sortearNumero(1, this.plano.getTamanhoX());
					coordenada[1] = sortearNumero(1, this.plano.getTamanhoY());
				}
			}

			posicoesIniciais.add(coordenada);
		}

		return posicoesIniciais;
	}

	public void povoarPlano() {
		ArrayList<int[]> posicoesIniciais = this.sortearElementosNoPlano();

		for (int i = 0; i < posicoesIniciais.size(); i++) {
			for (int j = 0; j < this.plano.getListaCelulas().size(); j++) {
				if (this.plano.getListaCelulas().get(j).getPosicaoX() == posicoesIniciais.get(i)[0]
						&& this.plano.getListaCelulas().get(j).getPosicaoY() == posicoesIniciais.get(i)[1]) {
					
			
					if (posicoesIniciais.get(i)[2] == 1) {
						Aluno novoAluno = new Aluno();
						this.plano.getListaCelulas().get(j).adicionar(novoAluno); 
					} else if (posicoesIniciais.get(i)[2] == 2) {
						Bug novoBug = new Bug();
						this.plano.getListaCelulas().get(j).adicionar(novoBug);
					}
				}
			}
		}
	}

	public void atualizarPosicaoRobo(Robo robo) {
		for (int i = 0; i < this.plano.getListaCelulas().size(); i++) {
			this.plano.getListaCelulas().get(i).remover(robo);
		}

		
		for (int i = 0; i < this.plano.getListaCelulas().size(); i++) {
			if (this.plano.getListaCelulas().get(i).getPosicaoX() == robo.posicaoX
					&& this.plano.getListaCelulas().get(i).getPosicaoY() == robo.posicaoY) {
				this.plano.getListaCelulas().get(i).adicionar(robo);
			}
		}
		
	}

	public void adicionarRobo(Robo robo) { 
		for (int i = 0; i < this.plano.getListaCelulas().size(); i++) {
			if (this.plano.getListaCelulas().get(i).getPosicaoX() == 1
					&& this.plano.getListaCelulas().get(i).getPosicaoY() == 1) {
				this.plano.getListaCelulas().get(i).adicionar(robo);
			}
		}
	}

	public void verificarColisao(Robo robo) {
		for (int i = 0; i < this.plano.getListaCelulas().size(); i++) {

			if (this.plano.getListaCelulas().get(i).getPosicaoX() == robo.posicaoX
					&& this.plano.getListaCelulas().get(i).getPosicaoY() == robo.posicaoY) {

				for (int j = 0; j < this.plano.getListaCelulas().get(i).getElementos().size(); j++) {
					if (this.plano.getListaCelulas().get(i).getElementos().get(j).getTipo() == 1) {
						robo.ganharPontos();
						this.quantAlunos--;
						this.plano.getListaCelulas().get(i).desocuparPrimeiro();
					} else if (this.plano.getListaCelulas().get(i).getElementos().get(j).getTipo() == 2) {
						robo.perderPontos();
						this.quantBugs--;
						this.plano.getListaCelulas().get(i).desocuparPrimeiro();
					}
				}
			}
		}
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public int getQuantAlunos() {
		return quantAlunos;
	}

	public void setQuantAlunos(int quantAlunos) {
		this.quantAlunos = quantAlunos;
	}

	public int getQuantdBugs() {
		return quantBugs;
	}

	public void setQuantBugs(int quantBugs) {
		this.quantBugs = quantBugs;
	}

}