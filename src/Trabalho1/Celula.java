package Trabalho1;

import java.util.ArrayList;

public class Celula {

	private int posicaoX;
	private int posicaoY;
	private int id;
	private ArrayList<Personagens> elementos;
	

	public Celula(int id, int x , int y) {
		this.posicaoX = x;
		this.posicaoY = y;
		this.id = id;
		elementos = new ArrayList<>();
	}
	
	public void adicionar(Personagens elemento) {
		this.elementos.add(elemento);
	}

	public void remover(Personagens elementoParaRemover) {
	    if (this.elementos.size() > 0) {
	        for (int i = 0; i < elementos.size(); i++) {
	            if (elementos.get(i) == elementoParaRemover) {
	                elementos.remove(i);
	                break; 
	            }
	        }
	    }
	}
	
	public void desocuparPrimeiro() {
	    if (this.elementos.size() > 0) {
	        elementos.remove(0);
	    }
	}
	
	
	public String infos() {
		if(elementos.size() > 0) {
			if(elementos.size() > 1) {
				return "[" + this.elementos.size() + "]";
			}else {
				return "[" + this.elementos.get(elementos.size()-1).mostrar() + "]";
			}
		}else {
			return "[ ]";
		}
	}
	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Personagens> getElementos() {
		return elementos;
	}

	public void setElementos(ArrayList<Personagens> elementos) {
		this.elementos = elementos;
	}
}