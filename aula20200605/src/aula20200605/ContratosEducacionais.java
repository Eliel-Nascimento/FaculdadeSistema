package aula20200605;

import java.util.ArrayList;
import java.util.List;

public class ContratosEducacionais {
	private int numContrato;
	private Alunos aluno;
	private List<Avalistas> avalista  = new ArrayList <>();


	public ContratosEducacionais(int numContrato, Alunos aluno, Avalistas a) {
		super();
		this.numContrato = numContrato;
		this.aluno = aluno;
		this.avalista.add(a);
	}

	public int getNumContrato() {
		return numContrato;
	}

	public Alunos getAluno() {
		return aluno;
	}

	public List<Avalistas> getAvalista() {
		return avalista;
	}
	public void addAvalista (Avalistas a) {
		avalista.add(a);
	}

}