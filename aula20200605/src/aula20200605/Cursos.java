package aula20200605;

import java.util.ArrayList;
import java.util.List;

public class Cursos {

	private String descricao;
	private int numCurso;

	private Coordenadores coordenador;

	private List<Turmas> turmas = new ArrayList<>();
	private List<Disciplina> disciplinas = new ArrayList<>();

	public Cursos(String descricao, int numCurso, Coordenadores coordenador) {
		super();
		this.descricao = descricao;
		this.numCurso = numCurso;
		this.coordenador = coordenador;
	}

}
