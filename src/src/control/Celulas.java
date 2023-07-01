package control;

public class Celulas {

	private boolean Aluno;
	private boolean Bug;
	private boolean Visitado;

	public Celulas() {
		Aluno = false;
		Bug = false;
	}

	public boolean getAluno() {
		return Aluno;
	}

	public void setAluno(boolean aluno) {
		Aluno = aluno;
	}

	public boolean getBug() {
		return Bug;
	}

	public void setBug(boolean bug) {
		Bug = bug;
	}

	public boolean getVisitado() {
		return Visitado;
	}

	public void setVisitado(boolean visitado) {
		Visitado = visitado;
	}
}
