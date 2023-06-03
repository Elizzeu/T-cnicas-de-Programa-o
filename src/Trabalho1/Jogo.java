package Trabalho1;

import java.util.Scanner;

public class Jogo {
	private String nome;
	private int tamanhoX;
	private int tamanhoY;
	private int quantAlunos;
	private int quantBugs;
	private Plano p;
	private Servicos servicos;
	
	Scanner input = new Scanner(System.in);
	
	private RoboAndador andador = new RoboAndador();
	
	

	private RoboPeao peao = new RoboPeao();
	private RoboTorre torre = new RoboTorre();
	private RoboBispo bispo = new RoboBispo();
	private RoboCavalo cavalo = new RoboCavalo();
	private RoboRei rei = new RoboRei();
	private RoboRainha rainha = new RoboRainha();

	public Jogo(String nome, int tamanhoX, int tamanhoY, int quanttAlunos, int quantBugs) {
		this.nome = nome;
		this.tamanhoX = tamanhoX;
		this.tamanhoY = tamanhoY;
		this.quantAlunos = quanttAlunos;
		this.quantBugs = quantBugs;                                                                            
	}
	
	public void prepararJogo() {
		p = new Plano(tamanhoX, tamanhoY);
		p.montarPlano();
		servicos = new Servicos(p, quantAlunos, quantBugs);
	
		servicos.povoarPlano();
		servicos.adicionarRobo(andador);
		servicos.adicionarRobo(peao);
		servicos.adicionarRobo(torre);
		servicos.adicionarRobo(bispo);
		servicos.adicionarRobo(cavalo);
		servicos.adicionarRobo(rei);
		servicos.adicionarRobo(rainha);
	}
	
	public void acaoRobo(Robo robo, int numCelulasMaxima) {
		int Acao;
		int quantCelulas = 5;
		
		System.out.println("Avançar[1]  Retroceder[2]? [1/2]");
		Acao = input.nextInt();
		
		switch(numCelulasMaxima) {
			case 1:
				quantCelulas = 1;
				break;
			case 2:
				while(quantCelulas > 2) {
					System.out.println("Quantas células deseja mover? (Até 2)");
					quantCelulas = input.nextInt();
				}
				break;
			case 4:
				while(quantCelulas > 4) {
					System.out.println("Quantas células deseja mover? (Até 4)");
					quantCelulas = input.nextInt();
				}
				break;
			default:
				System.out.println("Quantas células você deseja mover?");
				quantCelulas = input.nextInt();
				break;
		}
		
		
		switch(Acao) {
			case 1:
				robo.avancar(quantCelulas);
				break;
			case 2:
				robo.retroceder(quantCelulas);
				break;
			default:
				System.out.println("Digite uma opção válida! [1/2]:");
				break;
		}
	
		servicos.atualizarPosicaoRobo(robo);
		servicos.verificarColisao(robo);
		
	}

	public void Jogar() {
		this.prepararJogo();
		
		String sair = "n";
		
		while(sair.equals("n")) {
			System.out.println("\n------------------------------------");
			servicos.getPlano().retornarCelulasMontadas();
			System.out.println("--------------------------------------\n");
			System.out.println("Alunos: " + servicos.getQuantAlunos());
			System.out.println("Bugs: " + servicos.getQuantdBugs() + "\n");
			System.out.println("ESCOLHA UM ROBO");
			System.out.println("(1) Robô Andador |A| ("+ andador.posicaoX +", "+ andador.posicaoY +") ("+ andador.pontos +" pontos)");
			System.out.println("(2) Robô Peão    |P| ("+ peao.posicaoX +", "+ peao.posicaoY +") ("+ peao.pontos +" pontos)");
			System.out.println("(3) Robô Torre   |T| ("+ torre.posicaoX +", "+ torre.posicaoY +") ("+ torre.pontos +" pontos)");
			System.out.println("(4) Robô Bispo   |B| ("+ bispo.posicaoX +", "+ bispo.posicaoY +") "+ bispo.pontos + " pontos)");
			System.out.println("(5) Robô Cavalo  |C| ("+ cavalo.posicaoX +", "+ cavalo.posicaoY +") ("+ cavalo.pontos +" pontos)");
			System.out.println("(6) Robô Rei     |R| ("+ rei.posicaoX +", "+ rei.posicaoY +") ("+ rei.pontos +" pontos)");
			System.out.println("(7) Robô Rainha  |r| ("+ rainha.posicaoX +", "+ rainha.posicaoY +") ("+ rainha.pontos +" pontos)");
			
			
			int resposta = 0;
			System.out.print("\nSua resposta: ");
			resposta = input.nextInt();
			input.nextLine(); // Consumir nova linha em branco para evitar erros
			
			switch(resposta) {
				case 1:
					this.acaoRobo(andador, 0);
					break;
				case 2:
					this.acaoRobo(peao, 1);
					break;
				case 3:
					this.acaoRobo(torre, 2);
					break;
				case 4:
					this.acaoRobo(bispo, 2);
					break;
				case 5:
					this.acaoRobo(cavalo, 2);
					break;
				case 6:
					this.acaoRobo(rei, 4);
					break;
				case 7:
					this.acaoRobo(rainha, 4);
					break;
				default:
					System.out.println("O Robô inserido não existe!");
					break;
			}
			input.nextLine(); // Consumir nova linha em branco para evitar erros
			
			System.out.println("Deseja parar de jogar? [s/n]");

			sair = input.nextLine();	
			
			
		}
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public int getQtdAlunos() {
		return quantAlunos;
	}

	public void setQtdAlunos(int qtdAlunos) {
		this.quantAlunos = qtdAlunos;
	}

	public int getQtdBugs() {
		return quantBugs;
	}

	public void setQtdBugs(int qtdBugs) {
		this.quantBugs = qtdBugs;
	}

	public Plano getP() {
		return p;
	}

	public void setP(Plano p) {
		this.p = p;
	}

	public Servicos getServicos() {
		return servicos;
	}

	public void setServicos(Servicos servicos) {
		this.servicos = servicos;
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public RoboAndador getAndador() {
		return andador;
	}

	public void setAndador(RoboAndador andador) {
		this.andador = andador;
	}

	public RoboPeao getPeao() {
		return peao;
	}

	public void setPeao(RoboPeao peao) {
		this.peao = peao;
	}

	public RoboTorre getTorre() {
		return torre;
	}

	public void setTorre(RoboTorre torre) {
		this.torre = torre;
	}

	public RoboBispo getBispo() {
		return bispo;
	}

	public void setBispo(RoboBispo bispo) {
		this.bispo = bispo;
	}

	public RoboCavalo getCavalo() {
		return cavalo;
	}

	public void setCavalo(RoboCavalo cavalo) {
		this.cavalo = cavalo;
	}

	public RoboRei getRei() {
		return rei;
	}

	public void setRei(RoboRei rei) {
		this.rei = rei;
	}

	public RoboRainha getRainha() {
		return rainha;
	}

	public void setRainha(RoboRainha rainha) {
		this.rainha = rainha;
	}

}
