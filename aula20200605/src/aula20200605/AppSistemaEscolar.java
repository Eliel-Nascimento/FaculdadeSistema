package aula20200605;

public class AppSistemaEscolar {

	public static void main(String[] args) {
		// --Parte Endereço Aluno
		Endereco end1 = new Endereco("Av. Cuiaba", 1818, "Igreja", "Esperanca", "Sarandi", "Paraná", true);
		Endereco end2 = new Endereco("Av.Violetas", 374, "casa", "Gralha azul", "Sarandi", "Paraná", false);
		Alunos eliel = new Alunos(1);
		eliel.setNome("Eliel");
		eliel.setSobrenome("Nascimento");
		eliel.setDataNascimento("06/08/1992");
		eliel.addEndereco(end1);
		eliel.addEndereco(end2);
		// --Parte avalista
		Endereco endjose = new Endereco("R. Ana neri", 398, "apartamento", "Sulamerica", "Sarandi", "Paraná", true);
		Avalistas jose = new Avalistas(1);
		jose.setNome("jose");
		jose.setSobrenome("Palmito");
		jose.setDataNascimento("22/11/1950");
		jose.addEndereco(endjose);

		ContratosEducacionais c1 = new ContratosEducacionais(1, eliel, jose);
		eliel.addContrato(c1);
		// --Parte coordenador
		Endereco end1santos = new Endereco("R. Eldorado", 101, "Casa", "Jose Richa", "Sarandi", "Paraná", true);
		Endereco end2santos = new Endereco("R. Fabio", 1025, "casa", "Floresta", "Sarandi", "Paraná", false);
		Coordenadores coordenadorSantos = new Coordenadores(1);
		coordenadorSantos.setNome("Santos");
		coordenadorSantos.setSobrenome("Mattos");
		coordenadorSantos.setDataNascimento("07/08/1984");
		coordenadorSantos.addEndereco(end1santos);
		coordenadorSantos.addEndereco(end2santos);
		// --Parte Professor
		Endereco endprof = new Endereco("Av Londrinha", 1231, "casa", "Maringa", "Sarandi", "Paraná", true);
		Professor professorMiguel = new Professor(1);
		professorMiguel.setNome("Miguel");
		professorMiguel.setSobrenome("Paz");
		professorMiguel.setDataNascimento("02/05/2000");
		professorMiguel.addEndereco(endprof);
		// --Parte Curso
		Cursos engenheiro = new Cursos("engenheiro civil", 1, coordenadorSantos);
		Turmas turma1 = new Turmas("Turma 1", 1, engenheiro);
		Disciplina civil = new Disciplina(1, "Civil");
		civil.addProfessor(professorMiguel);
		turma1.addAlunos(eliel);

	}

}
