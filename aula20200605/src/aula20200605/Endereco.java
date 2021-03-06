package aula20200605;

public  class Endereco {
	private String logradouro;
	private int numero;
	private String complemento;
	private String 	bairro;
	private String cidade;
	private String estado;
	private boolean principal;
	
	public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade, String estado, boolean principal) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.principal = principal; 
	}
	

	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}
	
	public boolean getPrincipal() {
		return principal;
	}

}
