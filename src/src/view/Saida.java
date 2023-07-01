package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import control.Jogo;

public class Saida extends JPanel {


	private Jogo jogo;
	private JButton botao;

	// construtot
	public Saida(Jogo jogo) {
		this.jogo = jogo;

		this.botao = new JButton("FECHAR JOGO");

		painelIniciar();
		addComponents();
		configBotao();
	}

	private void painelIniciar() {
		setBackground(Color.GRAY);
		setPreferredSize(new Dimension(575, 500));
		setLayout(new BorderLayout());
	}

	private void addComponents() {
		String[] colunas = { "Jogador", "Rodadas", "Celulas Vazias", "Pontuação", "Alunos", "Bugs", "Andador", "Cavalo",
				"Rei" };
		String[][] dados = new String[jogo.getQuantJogadores()][9];

		for (int i = 0; i < dados.length; i++) {
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

		DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
		JTable tabela = new JTable(modelo);

		tabela.setCellSelectionEnabled(false);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
		tabela.setRowHeight(30);

		JScrollPane painelRolagem = new JScrollPane(tabela);
		painelRolagem.setPreferredSize(new Dimension(550, 400));

		add(painelRolagem, BorderLayout.CENTER);
		add(botao, BorderLayout.SOUTH);
	}

	private void configBotao() {
		botao.setBackground(Color.WHITE);
		botao.setPreferredSize(new Dimension(150, 80));
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public void atualizarPainelSair() {
		removeAll();
		painelIniciar();
		addComponents();
		System.exit(0);
	}

}
