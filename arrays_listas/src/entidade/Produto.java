package entidade;

public class Produto {
	
	// ATRIBUTOS
	private String nome;
	private double preco;
	
	// CONSTRUTOR
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	// METODOS MODIFICADORES
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
