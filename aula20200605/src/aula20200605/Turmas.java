package aula20200605;

import java.util.ArrayList;
import java.util.List;

public class Turmas {

	private String descricao;
	private int numTurma;
	

	private Cursos curso;
	private List<Alunos> alunos = new ArrayList<>();
	

	public Turmas(String descricao, int numTurma, Cursos curso) {
		super();
		this.descricao = descricao;
		this.numTurma = numTurma;
		this.curso = curso;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getNumTurma() {
		return numTurma;
	}

	public Cursos getCurso() {
		return curso;
	}

	public List<Alunos> getAlunos() {
		return alunos;
	}

	public void addAlunos(Alunos a) {
		alunos.add(a);
	}

}
