package entidades;

public class Produto {
	
	// CRIACAO DOS ATRIBUTOS DA CLASSE
	
	private String nome;
	private double preco;
	private int quantidade;
	
	// CONSTRUTOR
	
	public Produto() { // quando um método tem exatamento o nome da classe, quer dizer que este método é um construtor.
	}
	
	public Produto(String nome, double preco, int quantidade) { // construtores são executados no momento da instanciação de um objeto
		this.nome = nome; // essa declaração diz que o atributo da classe (nome) recebe o parametro do objeto (nome)
		this.preco = preco;
		this.quantidade = quantidade;		
	}
	
	// OUTRO CONSTRUTOR PARA USO DE SOBRECARGA
	// a sobrecarga diz sobre o uso de mais de um construtor na aplicação
	
	public Produto(String nome, double preco) { // construtores são executados no momento da instanciação de um objeto
		this.nome = nome; // essa declaração diz que o atributo da classe (nome) recebe o parametro do objeto (nome)
		this.preco = preco;	
	}
	
	// CRIACAO DOS METODOS DA CLASSE
	
	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade; // o THIS faz referencia ao atributo da classe e não a algum outro parametro.
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() { // neste método estamos sobrepondo o método toString padrão do Java
		return nome 
				+ ", $ " 
				+ String.format("%.2f", preco) 
				+ ", " 
				+ quantidade 
				+ " unidade(s), Total: $ " 
				+ String.format("%.2f", valorTotalEstoque());			
	}
}