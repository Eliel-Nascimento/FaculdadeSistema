package aula20200605;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Pessoa {

	private int numCoordenador;

	private List<Cursos> cursos = new ArrayList<>();

	public Coordenadores(int numCoordenador) {

		this.numCoordenador = numCoordenador;
	}

	public int getNumCoordenador() {
		return numCoordenador;
	}

	public List<Cursos> getCursos() {
		return cursos;
	}

	public void addCurso(Cursos c) {
		cursos.add(c);
	}

}
