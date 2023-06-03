package Trabalho1;

import java.util.ArrayList;

public class Plano {

	private ArrayList<Celula> listaCelulas;
	private int tamanhoX;
	private int tamanhoY;



	public Plano(int tamanhoX, int tamanhoY) {
		
		this.tamanhoX = tamanhoX;
		this.tamanhoY = tamanhoY;
		
	}

	
	public void montarPlano() {
		listaCelulas = new ArrayList<Celula>();

		int contador = 1;
		for (int j = tamanhoY; j >= 1; j--) {
			for (int i = 1; i <= tamanhoX; i++) {
				Celula celula = new Celula(contador, i, j);
				listaCelulas.add(celula);
				contador++;
			}
		}
	}
	
	
	public Celula retornarCelula(int x, int y) {

		for (int i = 0; i < listaCelulas.size(); i++) {
			if (listaCelulas.get(i).getPosicaoX() == x && listaCelulas.get(i).getPosicaoY() == y) {
				return listaCelulas.get(i);
			}
		}
		return null;
	}

	public void retornarCelulas() {
		for (int i = 0; i < listaCelulas.size(); i++) {
			System.out.println(listaCelulas.get(i).infos());
		}
	}
	
	public void retornarCelulasMontadas() {
		int cont = 0;
		
		for (int i = 0; i < this.tamanhoY; i++) {
			for(int j = 0; j < this.tamanhoX; j++) {
				System.out.print(listaCelulas.get(cont).infos());
				cont++;
			}
			System.out.println();
		}
	}
	public ArrayList<Celula> getListaCelulas() {
		return listaCelulas;
	}


	public void setListaCelulas(ArrayList<Celula> listaCelulas) {
		this.listaCelulas = listaCelulas;
	}


	public int getTamanhoX() {
		return tamanhoX;
	}


	public void setTamanhoX(int tamanhoX) {
		this.tamanhoX = tamanhoX;
	}


	public int getTamanhoY() {
		return tamanhoY;
	}


	public void setTamanhoY(int tamanhoY) {
		this.tamanhoY = tamanhoY;
	}

}
