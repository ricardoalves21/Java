package entidades;

public class Produto {
	
	// CRIACAO DOS ATRIBUTOS DA CLASSE
	
	public String nome;
	public double preco;
	public int quantidade;
	
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