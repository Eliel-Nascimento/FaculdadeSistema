package aula20200605;

import java.util.ArrayList;
import java.util.List;

public class Alunos extends Pessoa {

	private boolean status = false	;
	private int ra;

	public Alunos(int ra) {
		super();
		this.ra = ra;
	}

	private ContratosEducacionais contrato;

	
	private List<Turmas> turmas = new ArrayList<>();
	
	
	public void addContrato(ContratosEducacionais c) {
		if (status == false) {
			contrato = c;
			status = true;
		 }
		
	}
	  public boolean  statusAlunos ( ) { 
		  return status;
	}
	  public  void addTurma(Turmas t) {
		  turmas.add(t);
	  }
	  
}
