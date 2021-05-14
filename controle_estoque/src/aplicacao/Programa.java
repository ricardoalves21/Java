package aplicacao; // descri��o do pacote

// inser��o das bibliotecas
import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

public class Programa { // descri��o da classe

	public static void main(String[] args) { // in�cio do programa
	
		Locale.setDefault(Locale.US); // usando a biblioteca Locale
		Scanner sc = new Scanner(System.in); // usando a biblioteca Scanner
		
		System.out.println("ENTRE COM O PRODUTO"); // t�tulo da aplica��o
		System.out.println();
		
		System.out.print("Nome: "); // solicitando ao usu�rio o nome do produto
		String nome = sc.nextLine(); // guardando a resposta do usu�rio no objeto produto no atributo nome
		
		System.out.print("Pre�o: ");
		double preco = sc.nextDouble();
		
//		System.out.print("Quantidade: ");
//		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, preco);		
		
		produto.setNome("Computador");
		System.out.println("Atualizar nome: " + produto.getNome());
		
		produto.setPreco(500.00);
		System.out.println("Pre�o atualizado: " + produto.getPreco());
		
		
		System.out.println();
		System.out.println("Dados do produto: " + produto); // quando coloco apenas o nome do objeto no println o Java j� entende que a resposta ser� do tipo String.
		
		System.out.println();
		System.out.print("Entre com a quantidade de produtos que ser� adicionada ao estoque: ");
		int qtdEntrada = sc.nextInt();
		produto.adicionarProduto(qtdEntrada);
		
		System.out.println();
		System.out.println("Atualiza��o de estoque: " + produto);
		
		System.out.println();
		System.out.print("Entre com a quantidade de produtos que ser� retirada do estoque: ");
		int qtdSaida = sc.nextInt();
		produto.removerProduto(qtdSaida);
		
		System.out.println();
		System.out.println("Atualiza��o de estoque: " + produto);
		
		sc.close();
	}

}

// no Java toda Classe � uma subclasse da Classe Object
// toString = trata-se de um m�todo da subclasse Object
// por isso todo objeto instanciado em qualquer Classe poder� acessar os m�todos da Classe Object


