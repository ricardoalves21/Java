package entidades;

public class Produto {
	
	// CRIACAO DOS ATRIBUTOS DA CLASSE
	
	private String nome;
	private double preco;
	private int quantidade;
	
	// CONSTRUTOR
	
	public Produto() { // quando um m�todo tem exatamento o nome da classe, quer dizer que este m�todo � um construtor.
	}
	
	public Produto(String nome, double preco, int quantidade) { // construtores s�o executados no momento da instancia��o de um objeto
		this.nome = nome; // essa declara��o diz que o atributo da classe (nome) recebe o parametro do objeto (nome)
		this.preco = preco;
		this.quantidade = quantidade;		
	}
	
	// OUTRO CONSTRUTOR PARA USO DE SOBRECARGA
	// a sobrecarga diz sobre o uso de mais de um construtor na aplica��o
	
	public Produto(String nome, double preco) { // construtores s�o executados no momento da instancia��o de um objeto
		this.nome = nome; // essa declara��o diz que o atributo da classe (nome) recebe o parametro do objeto (nome)
		this.preco = preco;	
	}
	
	// CRIACAO DOS METODOS DA CLASSE
	
	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade; // o THIS faz referencia ao atributo da classe e n�o a algum outro parametro.
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() { // neste m�todo estamos sobrepondo o m�todo toString padr�o do Java
		return nome 
				+ ", $ " 
				+ String.format("%.2f", preco) 
				+ ", " 
				+ quantidade 
				+ " unidade(s), Total: $ " 
				+ String.format("%.2f", valorTotalEstoque());			
	}
}