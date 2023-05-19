package negocio;

import apresentacao.*;
import java.util.Random;

public class Jogo {

	private Jogador jogador;
	private Tela tela;
	private Terminal terminal;
	private int numeroEscolhido;
	private boolean jogando;

	public Jogo() {
		tela = new Tela();
		terminal = new Terminal();
		jogador = new Jogador();
		numeroEscolhido = (int) (Math.floor(Math.random()*10)+1);
		jogando = true;
	}

	public void inciarJogoTerminal() {
		jogador.setNome(terminal.entradaNome());
		terminal.mesagem("Seja bem vindo: " + jogador.getNome());
	}

	public void inciarJogoGUI() {
		jogador.setNome(tela.entradaDados("Qual é o seu nome?"));
		tela.mesagem("Seja bem vindo: " + jogador.getNome());
		jogadas();
		
		String numeros = "";
		for (Integer numero : jogador.getListaNumeros()) {
			numeros += " - " + numero;
		} 
		}

	public int solicitarNumero() {
		String numero = tela.entradaDados("Informe um numero:");
		return Integer.parseInt(numero);
	}

	public void jogadas() {
		do {
			verificarAcerto();
		} while (jogando);

		fimDoJogo();
	}

	public void fimDoJogo() {



	}

	public boolean verificarMenor(int numero) {
		if (numero < numeroEscolhido)
			return true;

		return false;
	}

	public void verificarAcerto() {
		int numero = solicitarNumero();
		jogador.addNumero(numero);
		
		if (numero == numeroEscolhido) 
			acertou();
		 else 
			errou(numero);
		
	}
	
	public void acertou() {
		String numeros = "";
		for (Integer numero : jogador.getListaNumeros()) {
			numeros += " - " + numero;
		}
	
		tela.mesagem("Parabens voce acertou! numero de tentativas: " + jogador.getNumeroTentativa() + " Numeros tentados " + numeros);
		
		jogando = false;
		}
	
	public void errou(int numero) {

		if (verificarMenor(numero)) {
			tela.mesagem("Deu ruim,  voce errou! tente um numero maior diferente de " + numero);
		} else {
			tela.mesagem("Deu ruim,  voce errou! Tente numero menor diferente de "+ numero);
		}
		jogador.setNumeroTentativa();

	}
	// public void verificarAcerto() {
	// do {
	// if (solicitarNumero() == numeroEscolhido) {
	// jogador.setNumeroTentativa();
	// tela.mesagem("Parabens voce acertou! numero de tentativas: " +
	// jogador.getNumeroTentativa());
	// return;
	// } else {
	// tela.mesagem("Deu ruim, voce errou");
	// jogador.setNumeroTentativa();
	// }
	// } while (true);
	// }
}
