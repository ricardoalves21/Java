package entidade;

public class Departamento {
	
	// ATRIBUTOS DA CLASSE
	private String nome;
	
	// CONSTRUTOR PADRÃO VAZIO
	public Departamento() {		
	}

	// CONSTRUTOR COM ARGUMENTOS
	public Departamento(String nome) {
		this.nome = nome;
	}

	// METODOS GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
