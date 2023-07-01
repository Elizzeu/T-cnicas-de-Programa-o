package control;

public class Jogador {
	
	private String Nome;
	private int Rodadas;
	private int CasasVazias;
	private int PontosTotal;
	private int Alunos;
	private int Bugs;
	private int PontosAndador;
	private int PontosCavalo;
	private int PontosBispo;
	
	public Jogador(String nome) {
		Nome = nome;
		Rodadas = 1;
		CasasVazias = 0;
		PontosTotal = 0;
		Alunos = 0;
		Bugs = 0;
		PontosAndador = 0;
		PontosCavalo = 0;
		PontosBispo = 0;
	}
	
	// contrutor 
	public Jogador(String nome, int rodadas, int casasVazias, int pontosTotal, int alunos, int bugs, int pontosAndador,
			int pontosCavalo, int pontosBispo) {
		Nome = nome;
		Rodadas = rodadas;
		CasasVazias = casasVazias;
		PontosTotal = pontosTotal;
		Alunos = alunos;
		Bugs = bugs;
		PontosAndador = pontosAndador;
		PontosCavalo = pontosCavalo;
		PontosBispo = pontosBispo;
	}
	// impressao de no pailnel de impressao usando String
	public String formatarDados() {
		
		String Saida = "";
		
		Saida += getNome() + ";" + getRodadas() + ";" + getCelulasVazias() + ";" + getPontosTotal() + 
				";" + getAlunos() + ";" + getBugs() + ";" + getPontosAndador() + ";" + getPontosCavalo() + 
				";" + getPontosBispo() + "\n" ;
		
		return Saida;
	}
	
	public String getNome() {
		return Nome;
	}

	public int getRodadas() {
		return Rodadas;
	}

	public void aumentarRodadas() {
		Rodadas++;
	}

	public int getCelulasVazias() {
		return CasasVazias;
	}

	public void setCelulasVazias() {
		CasasVazias++;
	}
	
	public void atualizarPontos() {
		PontosTotal = PontosAndador + PontosCavalo + PontosBispo;
	}
	
	public int getPontosTotal() {
		return PontosTotal;
	}

	public void setPontosTotal(int pontosTotal) {
		PontosTotal = pontosTotal;
	}

	public int getAlunos() {
		return Alunos;
	}

	public void setAlunos() {
		Alunos++;
	}

	public int getBugs() {
		return Bugs;
	}

	public void setBugs() {
		Bugs++;
	}
	// funcao para add pontos 
	public void acertouRobo(int Robo) {
		
		if(Robo == 1) {
			PontosAndador += 10;
		} else if(Robo == 2) {
			PontosCavalo += 10;
		} else if(Robo == 3) {
			PontosBispo += 10;
		}
	}
	// funcao para descontapontos 
	public void errouRobo(int Robo) {
		
		if(Robo == 1) {
			PontosAndador -= 15;
		} else if(Robo == 2) {
			PontosCavalo -= 15;
		} else if(Robo == 3) {
			PontosBispo -= 15;
		}
	}
	
	public int getPontosAndador() {
		return PontosAndador;
	}

	public void setPontosAndador(int pontosAndador) {
		PontosAndador += pontosAndador;
	}

	public int getPontosCavalo() {
		return PontosCavalo;
	}

	public void setPontosCavalo(int pontosCavalo) {
		PontosCavalo += pontosCavalo;
	}

	public int getPontosBispo() {
		return PontosBispo;
	}

	public void setPontosBispo(int pontosRei) {
		PontosBispo = pontosRei;
	}
}
