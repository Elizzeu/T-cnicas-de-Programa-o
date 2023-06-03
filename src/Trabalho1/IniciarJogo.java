package Trabalho1;

import java.util.Scanner;

public class IniciarJogo {
	
	String nome;
	int tamanhoX;
	int tamanhoY;
	int quantAlunos;
	int quantBugs;
	Scanner entrada = new Scanner(System.in);
	
	public IniciarJogo() { 
		Jogo jogo = new Jogo(nome, tamanhoX, tamanhoY, quantAlunos, quantBugs);
	
	System.out.println("Digite seu nome: ");
	jogo.setNome(entrada.next());
	System.out.println("Seja bem vindo " +jogo.getNome()+"! Digite o tamanho do tabuleiro: ");
	
	System.out.print("coordenadaX: ");
	jogo.setTamanhoX(entrada.nextInt());
	System.out.print("coordenadaY: ");
	jogo.setTamanhoY(entrada.nextInt());
	
	System.out.println("Digite a quantidade de alunos: ");
	jogo.setQtdAlunos(entrada.nextInt());
	System.out.println("Digite a quantidade de Bug: ");
	jogo.setQtdBugs(entrada.nextInt()); 
	
	jogo.Jogar();
	
	}
	
	
}

