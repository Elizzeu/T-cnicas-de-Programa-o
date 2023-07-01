package control;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Plano {

	private ArrayList<Celulas> celulas;

	public Plano() {
		celulas = new ArrayList<Celulas>();

		for (int i = 0; i < 64; i++) {
			celulas.add(new Celulas());
		}

	}

	public void adicionarAlunos() {
		Random random = new Random();
		int cont = 21;

		List<Integer> indicesDisponiveis = new ArrayList<>();
		for (int i = 0; i < celulas.size(); i++) {
			if (!celulas.get(i).getAluno() && !celulas.get(i).getBug()) {
				indicesDisponiveis.add(i);
			}
		}
		// faz os sorteios dos anos nas celuas
		while (cont > 0 && !indicesDisponiveis.isEmpty()) {
			int indexSorteado = indicesDisponiveis.remove(random.nextInt(indicesDisponiveis.size()));
			celulas.get(indexSorteado).setAluno(true);
			cont--;
		}
	}

	// que armazena os índices das células disponíveis para adicionar bugs.
	public void adicionarBugs() {
		Random random = new Random();
		int cont = 21;

		List<Integer> indicesDisponiveis = new ArrayList<>();
		for (int i = 0; i < celulas.size(); i++) {
			if (!celulas.get(i).getAluno() && !celulas.get(i).getBug()) {
				indicesDisponiveis.add(i);
			}
		}
		// faz os sorteios dos Bugs
		while (cont > 0 && !indicesDisponiveis.isEmpty()) {
			int indexSorteado = indicesDisponiveis.remove(random.nextInt(indicesDisponiveis.size()));
			celulas.get(indexSorteado).setBug(true);
			cont--;
		}

	}

	public boolean getAluno(int index) {
		return celulas.get(index).getAluno();
	}

	public boolean getBug(int index) {
		return celulas.get(index).getBug();
	}

	public void setVisitado(int Index) {
		celulas.get(Index).setVisitado(true);
	}

	public boolean getVisitado(int Index) {
		return celulas.get(Index).getVisitado();
	}

}
