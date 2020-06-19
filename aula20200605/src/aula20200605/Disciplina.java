package aula20200605;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	private int numDisciplina;
	private String nome;
	private  List<Professor> professores = new ArrayList<>();
	
	public Disciplina(int numDisciplina, String nome) {
		super();
		this.numDisciplina = numDisciplina;
		this.nome = nome;
	}

	public int getNumDisciplina() {
		return numDisciplina;
	}

	public String getNome() {
		return nome;
	}

	public List<Professor> getProfessores() {
		return professores;
	}
     
	public void addProfessor(Professor p) {
		professores.add(p);
	}
	
}
