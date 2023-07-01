package control;

import java.util.ArrayList;
import model.EscreverDados;
import model.LerDados;

public class Jogo {
	
	private ArrayList<Jogador> dados;
	private EscreverDados Escrever;
	private LerDados Ler;
	private Plano Plano;
	
	public Jogo() {
		dados = new ArrayList<Jogador>();
		Escrever = new EscreverDados();
		Ler = new LerDados();
		Plano = new Plano();
		
		Ler.lerDados("dados/Players.txt");
		dados = Ler.getLista();
	}
	
	public void criarJogador(String nome) {
		dados.add(new Jogador(nome));
	}
	
	public void acertouRobo(int Robo) {
		int Aux = dados.size();
		dados.get(Aux-1).acertouRobo(Robo);
	}
	
	public void errouRobo(int Robo) {
		int Aux = dados.size();
		dados.get(Aux-1).errouRobo(Robo);
	}
	
	public void atualizarPontos() {
		int Aux = dados.size();
		dados.get(Aux-1).atualizarPontos();
	}
	
	public int getQuantJogadores() {
		return dados.size();
	}
	
	public void adicionarAlunos() {
		Plano.adicionarAlunos();
	}
	
	public void adicionarBugs() {
		Plano.adicionarBugs();
	}
	
	public void aumentarRodadas() {
		int Aux = dados.size();
		dados.get(Aux-1).aumentarRodadas();
	}
	
	public void escreverDados() {
		Escrever.escreverDados(formatarDados());
	}
	
	public String formatarDados() {
		
		String Saida = "";
		
		for (int i = 0; i < dados.size(); i++) {
			Saida += dados.get(i).formatarDados();
		}
		
		return Saida;
	}
	
	public int getPontosTotal(int indice) {
		return dados.get(indice).getPontosTotal();
	}
	
	public String getNome(int indice) {
		return dados.get(indice).getNome();
	}
	
	public int getAlunos(int indice) {
		return dados.get(indice).getAlunos();
	}
	
	public int getBugs(int indice) {
		return dados.get(indice).getBugs();
	}
	
	public int getPontosAndador(int indice) {
		return dados.get(indice).getPontosAndador();
	}
	
	public int getPontosCavalo(int indice) {
		return dados.get(indice).getPontosCavalo();
	}
	
	public int getPontosBispo(int indice) {
		return dados.get(indice).getPontosBispo();
	}
	
	public boolean getAlunoCasa(int indice) {
		return Plano.getAluno(indice);
	}
	
	public void setCasaVisitada(int indice) {
		Plano.setVisitado(indice);
	}
	
	public boolean getCasaVisitada(int indice) {
		return Plano.getVisitado(indice);
	}
	
	public void setAlunos() {
		int Aux = dados.size();
		dados.get(Aux-1).setAlunos();
	}
	
	public void setBugs() {
		int Aux = dados.size();
		dados.get(Aux-1).setBugs();
	}
	
	public void setCasasVazias() {
		int Aux = dados.size();
		dados.get(Aux-1).setCelulasVazias();
	}
	
	public boolean getBugCelulas(int indice) {
		return Plano.getBug(indice);
	}
	
	public int getPartidas(int indice) {
		return dados.get(indice).getRodadas();
	}
	
	public int getCelulasVazias(int indice) {
		return dados.get(indice).getCelulasVazias();
	}
	
}
