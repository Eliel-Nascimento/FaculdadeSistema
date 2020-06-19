package aula20200605;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
	
	private int numProfessor;
	private List<Disciplina> disciplinas = new ArrayList<>();
	
		public Professor(int numProfessor) {
		this.numProfessor = numProfessor;
	}
  
   public void addDisciplina(Disciplina d) {
	   
	disciplinas.add(d);
   }

public int getNumProfessor() {
	return numProfessor;
}

public List<Disciplina> getDisciplinas() {
	return disciplinas;
}
    
}
