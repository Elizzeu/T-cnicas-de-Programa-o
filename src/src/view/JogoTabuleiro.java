package view;

import java.awt.*;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

import javax.swing.table.DefaultTableModel;

import control.Jogo;

public class JogoTabuleiro extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private Jogo Jogo;
	private Painel Janela;
	private Relatorio PainelRel;

	private JLabel Pontos;
	private JLabel QuantAlunos;
	private JLabel QuantBugs;
	private JLabel PontosAndador;
	private JLabel PontosCavalo;
	private JLabel PontosBispo;

	private JButton BotaoAndador;
	private JButton BotaoCavalo;
	private JButton BotaoBispo;
	private int RoboSelecionado;

	private ArrayList<JButton> Celulas = new ArrayList<JButton>();

	// imagens
	private ImageIcon IconeAndador = new ImageIcon(
			"C:\\Users\\Elizeu\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\D3E5I734\\Elizeu(Ap2)[1]\\AP2\\icons\\bispo.png\\AP2\\icons\\corredor.png");
	private ImageIcon IconeCavalo = new ImageIcon(
			"C:\\Users\\Elizeu\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\D3E5I734\\Elizeu(Ap2)[1]\\AP2\\icons\\bispo.png\\AP2\\icons\\pedePano.png");
	private ImageIcon IconeBispo = new ImageIcon(
			"C:\\Users\\Elizeu\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\D3E5I734\\Elizeu(Ap2)[1]\\AP2\\icons\\bispo.png\\AP2\\icons\\bispo.png");
	private ImageIcon IconeAluno = new ImageIcon(
			"C:\\Users\\Elizeu\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\D3E5I734\\Elizeu(Ap2)[1]\\AP2\\icons\\bispo.png\\AP2\\icons\\lzu.png");
	private ImageIcon IconeBug = new ImageIcon(
			"C:\\Users\\Elizeu\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\D3E5I734\\Elizeu(Ap2)[1]\\AP2\\icons\\bispo.png\\AP2\\icons\\lzu.png");
	private ImageIcon IconeVazio = new ImageIcon(
			"C:\\Users\\Elizeu\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\D3E5I734\\Elizeu(Ap2)[1]\\AP2\\icons\\bispo.png\\AP2\\icons\\marcarCelula.png");

	public JogoTabuleiro(Jogo jogo, Painel janela, Relatorio rel) {
		Jogo = jogo;
		this.Janela = janela;
		PainelRel = rel;

		this.setLayout(new BorderLayout());
		JPanel PainelPlano = tabuleiro();
		JPanel PainelRodada = painelRodada();

		this.add(PainelPlano, BorderLayout.CENTER);
		this.add(PainelRodada, BorderLayout.EAST);
	}

	private JPanel tabuleiro() {

		JPanel Painel = new JPanel();

		Painel.setLayout(new GridLayout(8, 8));
		Painel.setBackground(Color.LIGHT_GRAY);
		Painel.setPreferredSize(new Dimension(400, 520));

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {

				JButton Botao = new JButton();
				Botao.addActionListener(new AcaoCasa());

				if ((i + j) % 2 == 0) {
					Botao.setBackground(Color.WHITE);
				} else {
					Botao.setBackground(Color.BLACK);
				}

				Celulas.add(Botao);
				Painel.add(Botao);
			}
		}

		return Painel;
	}

	JPanel painelRodada() {
		JPanel painel = new JPanel();
		painel.setBackground(Color.GRAY);
		painel.setPreferredSize(new Dimension(180, 520));

		Pontos = new JLabel("Score: 0");
		JLabel totalLabel = new JLabel("Total: ");
		QuantAlunos = new JLabel(" 0 ", IconeAluno, JLabel.LEFT);
		QuantBugs = new JLabel(" 0 ", IconeBug, JLabel.LEFT);
		PontosAndador = new JLabel(" 0 ", IconeAndador, JLabel.LEFT);
		PontosCavalo = new JLabel(" 0 ", IconeCavalo, JLabel.LEFT);
		PontosBispo = new JLabel(" 0 ", IconeBispo, JLabel.LEFT);

		BotaoAndador = new JButton();
		BotaoCavalo = new JButton();
		BotaoBispo = new JButton();
		JButton verificar = new JButton("Verificar");
		JButton proximaRodada = new JButton("ProximaRodada");
		JButton sair = new JButton("Sair");

		Pontos.setPreferredSize(new Dimension(160, 25));
		totalLabel.setSize(50, 25);
		QuantAlunos.setPreferredSize(new Dimension(50, 25));
		QuantBugs.setPreferredSize(new Dimension(50, 25));
		PontosAndador.setPreferredSize(new Dimension(50, 25));
		PontosCavalo.setPreferredSize(new Dimension(50, 25));
		PontosBispo.setPreferredSize(new Dimension(50, 25));

		BotaoAndador.setBackground(Color.GRAY);
		BotaoAndador.setIcon(IconeAndador);
		BotaoAndador.setPreferredSize(new Dimension(50, 50));
		BotaoAndador.addActionListener(new acaoAndador());

		BotaoCavalo.setBackground(Color.GRAY);
		BotaoCavalo.setIcon(IconeCavalo);
		BotaoCavalo.setPreferredSize(new Dimension(50, 50));
		BotaoCavalo.addActionListener(new acaoCavalo());

		BotaoBispo.setBackground(Color.GRAY);
		BotaoBispo.setIcon(IconeBispo);
		BotaoBispo.setPreferredSize(new Dimension(50, 50));
		BotaoBispo.addActionListener(new acaoBispo());

		verificar.setBackground(Color.WHITE);
		verificar.setPreferredSize(new Dimension(150, 50));
		verificar.addActionListener(new verificBotao());

		proximaRodada.setBackground(Color.WHITE);
		proximaRodada.setPreferredSize(new Dimension(150, 50));
		proximaRodada.addActionListener(new acaoNextRound());

		sair.setBackground(Color.WHITE);
		sair.setPreferredSize(new Dimension(150, 50));
		sair.addActionListener(this);

		painel.add(Pontos);
		painel.add(totalLabel);
		painel.add(QuantAlunos);
		painel.add(QuantBugs);
		painel.add(PontosAndador);
		painel.add(PontosCavalo);
		painel.add(PontosBispo);
		painel.add(BotaoAndador);
		painel.add(BotaoCavalo);
		painel.add(BotaoBispo);
		painel.add(verificar);
		painel.add(proximaRodada);
		painel.add(sair);

		return painel;
	}

	public void atualizarPainelRodada() {
		int aux = Jogo.getQuantJogadores() - 1;

		String strScore = "Score: " + Jogo.getPontosTotal(aux);
		String strAlunos = "" + Jogo.getAlunos(aux);
		String strBugs = "" + Jogo.getBugs(aux);
		String strAndador = "" + Jogo.getPontosAndador(aux);
		String strCavalo = "" + Jogo.getPontosCavalo(aux);
		String strRei = "" + Jogo.getPontosBispo(aux);

		Pontos.setText(strScore);
		QuantAlunos.setText(strAlunos);
		QuantBugs.setText(strBugs);
		PontosAndador.setText(strAndador);
		PontosCavalo.setText(strCavalo);
		PontosBispo.setText(strRei);
	}

	public void atualizarPainelRelatorio() {
		PainelRel.removeAll();

		String[] colunas = { "Jogador", "Rodadas", "Casas Vazias", "Pontuação", "Alunos", "Bugs", "Andador", "Cavalo",
				"Rei" };
		String[][] dados = new String[Jogo.getQuantJogadores()][9];

		for (int i = 0; i < dados.length; i++) {
			dados[i][0] = Jogo.getNome(i);
			dados[i][1] = String.valueOf(Jogo.getPartidas(i));
			dados[i][2] = String.valueOf(Jogo.getCelulasVazias(i));
			dados[i][3] = String.valueOf(Jogo.getPontosTotal(i));
			dados[i][4] = String.valueOf(Jogo.getAlunos(i));
			dados[i][5] = String.valueOf(Jogo.getBugs(i));
			dados[i][6] = String.valueOf(Jogo.getPontosAndador(i));
			dados[i][7] = String.valueOf(Jogo.getPontosCavalo(i));
			dados[i][8] = String.valueOf(Jogo.getPontosBispo(i));
		}

		DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
		JTable tabela = new JTable(modelo);
		tabela.setCellSelectionEnabled(false);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
		tabela.setRowHeight(30);

		JScrollPane painelRolagem = new JScrollPane(tabela);
		painelRolagem.setPreferredSize(new Dimension(550, 480));

		PainelRel.setBackground(Color.gray);
		PainelRel.setPreferredSize(new Dimension(575, 500));
		PainelRel.add(painelRolagem);
	}

	private class AcaoCasa implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton botaoAux = (JButton) e.getSource();
			int index = Celulas.indexOf(botaoAux);

			desabilitarBotaoRoboSelecionado(botaoAux);
			if (RoboSelecionado != 0) {
				verificarCelula(index, botaoAux);
				JOptionPane.showMessageDialog(null, "Jogada Relizada!");
			}
		}

		private void desabilitarBotaoRoboSelecionado(JButton botaoAux) {
			if (RoboSelecionado == 1) {
				BotaoAndador.setEnabled(false);
			} else if (RoboSelecionado == 2) {
				BotaoCavalo.setEnabled(false);
			} else if (RoboSelecionado == 3) {
				BotaoBispo.setEnabled(false);
			}
		}

		private void verificarCelula(int verif, JButton botaoAux) {
			if (Jogo.getAlunoCasa(verif)) {
				Jogo.setAlunos();
				Jogo.acertouRobo(RoboSelecionado);
			} else if (Jogo.getBugCelulas(verif)) {
				Jogo.setBugs();
				Jogo.errouRobo(RoboSelecionado);
			} else {
				Jogo.setCasasVazias();

			}

			Jogo.setCasaVisitada(verif);
			botaoAux.setEnabled(false);
			RoboSelecionado = 0;
		}
	}

	private class acaoAndador implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			RoboSelecionado = 1;
			BotaoAndador.setBackground(new Color(105, 235, 150));
			BotaoCavalo.setBackground(Color.white);
			BotaoBispo.setBackground(Color.white);
		}
	}

	private class acaoCavalo implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			RoboSelecionado = 2;
			BotaoAndador.setBackground(Color.white);
			BotaoCavalo.setBackground(new Color(105, 235, 150));
			BotaoBispo.setBackground(Color.white);

		}
	}
	private class acaoBispo implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			RoboSelecionado = 3;
			BotaoAndador.setBackground(Color.white);
			BotaoCavalo.setBackground(Color.white);
			BotaoBispo.setBackground(new Color(105, 235, 150));

		}
	}
	private class verificBotao implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (!BotaoAndador.isEnabled() && !BotaoCavalo.isEnabled() && !BotaoBispo.isEnabled()) {
				atualizarCelulas();
				atualizarPainelRodada();
				atualizarPainelRelatorio();
			}

		}
		private void atualizarCelulas() {
			for (int i = 0; i < Celulas.size(); i++) {
				if (Jogo.getCasaVisitada(i)) {
					atualizarCelula(i);
					Jogo.atualizarPontos();
				}
			}
		}
		private void atualizarCelula(int verif) {
			if (Jogo.getAlunoCasa(verif)) {
				Celulas.get(verif).setIcon(IconeAluno);
			} else if (Jogo.getBugCelulas(verif)) {
				Celulas.get(verif).setIcon(IconeBug);
			} else {
				Celulas.get(verif).setIcon(IconeVazio);
			}
		}
	}
	private class acaoNextRound implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (!(BotaoAndador.isEnabled() || BotaoCavalo.isEnabled() || BotaoBispo.isEnabled())) {
				BotaoAndador.setEnabled(true);
				BotaoCavalo.setEnabled(true);
				BotaoBispo.setEnabled(true);
				Jogo.aumentarRodadas();
				Jogo.escreverDados();
				atualizarPainelRelatorio();
			}

		}
	}
	public void actionPerformed(ActionEvent e) {
		this.setVisible(false);
		Janela.setPainelSair(true);
	}

}
