package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import control.Jogo;

public class Painel extends JFrame implements ActionListener {

	private Jogo Jogo;
	private JPanel Painel1;
	private JPanel Painel2;
	private JPanel PainelJogo;
	private Relatorio PainelRelatorio;
	private Saida PainelSaida;
	private JTextField NomeText;
	private JButton BotaoJogar;
	private JButton BotaoRelatorio;
	private boolean Iniciar;

	public void comecarJogo() {

		Jogo = new Jogo();

		this.setTitle("A ILHA 2.0");
		this.setSize(600, 600);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		NomeText = new JTextField();
		Painel1 = painel1();
		PainelRelatorio = new Relatorio(Jogo);
		PainelJogo = new JogoTabuleiro(Jogo, this, PainelRelatorio);
		PainelSaida = new Saida(Jogo);

		PainelRelatorio.setVisible(false);
		PainelJogo.setVisible(false);
		PainelSaida.setVisible(false);

		Painel2 = new JPanel();
		Painel2.setLayout(new FlowLayout());
		Painel2.setBackground(Color.BLACK);
		Painel2.add(PainelJogo);
		Painel2.add(PainelRelatorio);
		Painel2.add(PainelSaida);

		this.add(Painel1, BorderLayout.NORTH);
		this.add(Painel2, BorderLayout.CENTER);

		this.setVisible(true);
	}

	private JPanel painel1() {

		JPanel Painel = new JPanel();
		BotaoJogar = new JButton("Jogar");
		BotaoRelatorio = new JButton("Relatorio");
		NomeText.setPreferredSize(new Dimension(130, 25));

		BotaoJogar.setBackground(Color.white);
		BotaoJogar.addActionListener(new acaoJogar());
		BotaoRelatorio.setBackground(Color.white);
		BotaoRelatorio.addActionListener(new acaoRelatorio());

		Painel.setBackground(Color.GRAY);
		Painel.setPreferredSize(new Dimension(600, 40));
		Painel.add(new JLabel("Nome do jogador"));
		Painel.add(NomeText);
		Painel.add(BotaoJogar);
		Painel.add(BotaoRelatorio);

		return Painel;
	}

	private JPanel painelSair() {
		JPanel painel = new JPanel();
		painel.setBackground(Color.BLACK);
		painel.setPreferredSize(new Dimension(575, 500));

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

		String[] colunas = { "Jogador", "Rodadas", "Casas Vazias", "Pontuação", "Alunos", "Bugs", "Andador", "Cavalo",
				"Rei" };
		DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
		JTable tabela = new JTable(modelo);
		tabela.setCellSelectionEnabled(false);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
		tabela.setRowHeight(30);

		JScrollPane painelRolagem = new JScrollPane(tabela);
		painelRolagem.setPreferredSize(new Dimension(550, 400));

		JButton botao = new JButton("Sair");
		botao.setBackground(Color.GRAY);
		botao.setPreferredSize(new Dimension(150, 80));
		botao.addActionListener(new acaoExit());

		painel.add(painelRolagem);
		painel.add(botao);

		return painel;
	}

	public void atualizarPainelRelatorio() {

		PainelRelatorio.removeAll();

		PainelRelatorio.setBackground(Color.BLACK);
		PainelRelatorio.setPreferredSize(new Dimension(575, 500));

		String Dados[][] = new String[Jogo.getQuantJogadores()][9];

		String[] Colunas = { "Jogador", "Rodadas", "Casas Vazias", "Pontuação", "Alunos", "Bugs", "Andador", "Cavalo",
				"Rei" };

		DefaultTableModel Modelo = new DefaultTableModel(Dados, Colunas);

		JTable Tabela = new JTable(Modelo);

		Tabela.setCellSelectionEnabled(false);
		Tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
		Tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
		Tabela.setRowHeight(30);

		JScrollPane PainelRolagem = new JScrollPane(Tabela);
		PainelRolagem.setPreferredSize(new Dimension(550, 480));

		PainelRelatorio.add(PainelRolagem);

	}

	private class acaoJogar implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			PainelJogo.setVisible(true);
			BotaoJogar.setEnabled(false);
			NomeText.setEnabled(false);
			Iniciar = true;

			String nomeJogador = NomeText.getText();
			if (!nomeJogador.isEmpty()) {
				Jogo.criarJogador(nomeJogador);
				Jogo.adicionarAlunos();
				Jogo.adicionarBugs();

			} else {
				PainelJogo.setVisible(false);
				JOptionPane.showMessageDialog(null, "Insira o nome do jogador", "Mensagem",
						JOptionPane.INFORMATION_MESSAGE);
				NomeText.setEnabled(true);
				BotaoJogar.setEnabled(true);
			}
		}
	}

	private class acaoRelatorio implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (PainelRelatorio.isVisible() && Iniciar == false) {
				PainelJogo.setVisible(false);
				PainelRelatorio.setVisible(false);

			} else if (PainelRelatorio.isVisible() && Iniciar) {
				PainelJogo.setVisible(true);
				PainelRelatorio.setVisible(false);

			} else {
				PainelJogo.setVisible(false);
				PainelRelatorio.setVisible(true);
			}
		}
	}

	private class acaoExit implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public void actionPerformed(ActionEvent e) {

		JPanel Aux = painelSair();

		Painel2.add(Aux);

		PainelJogo.setVisible(false);
		PainelRelatorio.setVisible(false);
		Aux.setVisible(true);

		NomeText.setEnabled(false);
		BotaoJogar.setEnabled(false);
		BotaoRelatorio.setEnabled(false);

		Jogo.escreverDados();
	}

	public void setPainelSair(boolean b) {
		PainelSaida.atualizarPainelSair();
		PainelSaida.setVisible(b);
	}

	public JButton getBoButton() {
		return BotaoJogar;
	}

}
