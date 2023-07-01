package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import control.Jogo;

public class Relatorio extends JPanel {

	private static final long serialVersionUID = 1L;
	private Jogo jogo;
	private Border borda = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
	private JTable tabela;

	public Relatorio(Jogo jogo) {
		this.jogo = jogo;

		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(575, 500));
		this.setBorder(borda);

		String[][] dados = obterDados();

		String[] colunas = { "Jogador", "Rodadas", "Casas Vazias", "Pontuação", "Alunos", "Bugs", "Andador", "Cavalo",
				"Bispo" };

		DefaultTableModel modelo = new DefaultTableModel(dados, colunas);

		tabela = new JTable(modelo);
		configurarTabela();

		JScrollPane painelRolagem = new JScrollPane(tabela);
		painelRolagem.setPreferredSize(new Dimension(550, 480));

		this.add(painelRolagem);
	}

	private String[][] obterDados() {
		int quantJogadores = jogo.getQuantJogadores();
		String[][] dados = new String[quantJogadores][9];

		for (int i = 0; i < quantJogadores; i++) {
			dados[i][0] = jogo.getNome(i);
			dados[i][1] = String.valueOf(jogo.getPartidas(i));
			dados[i][2] = String.valueOf(jogo.getCelulasVazias(i));
			dados[i][3] = String.valueOf(jogo.getPontosTotal(i));
			dados[i][4] = String.valueOf(jogo.getAlunos(i));
			dados[i][5] = String.valueOf(jogo.getBugs(i));
			dados[i][6] = String.valueOf(jogo.getPontosAndador(i));
			dados[i][7] = String.valueOf(jogo.getPontosCavalo(i));
			dados[i][8] = String.valueOf(jogo.getPontosBispo(i));
		}

		return dados;
	}

	public void atualizarPainelRelatorio() {
		this.removeAll();

		String[][] dados = obterDados();
		String[] colunas = { "Jogador", "Rodadas", "Casas Vazias", "Pontuação", "Alunos", "Bugs", "Andador", "Cavalo",
				"Bispo" };

		DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
		tabela.setModel(modelo);

		configurarTabela();

		JScrollPane painelRolagem = new JScrollPane(tabela);
		painelRolagem.setPreferredSize(new Dimension(550, 480));
		this.add(painelRolagem);

	}

	private void configurarTabela() {
		tabela.setCellSelectionEnabled(false);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
		tabela.setRowHeight(30);

	}
}