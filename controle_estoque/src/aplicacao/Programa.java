package aplicacao; // descrição do pacote

// inserção das bibliotecas
import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

public class Programa { // descrição da classe

	public static void main(String[] args) { // início do programa
	
		Locale.setDefault(Locale.US); // usando a biblioteca Locale
		Scanner sc = new Scanner(System.in); // usando a biblioteca Scanner
		
		System.out.println("ENTRE COM O PRODUTO"); // título da aplicação
		System.out.println();
		
		System.out.print("Nome: "); // solicitando ao usuário o nome do produto
		String nome = sc.nextLine(); // guardando a resposta do usuário no objeto produto no atributo nome
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
//		System.out.print("Quantidade: ");
//		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, preco);		
		
		produto.setNome("Computador");
		System.out.println("Atualizar nome: " + produto.getNome());
		
		produto.setPreco(500.00);
		System.out.println("Preço atualizado: " + produto.getPreco());
		
		
		System.out.println();
		System.out.println("Dados do produto: " + produto); // quando coloco apenas o nome do objeto no println o Java já entende que a resposta será do tipo String.
		
		System.out.println();
		System.out.print("Entre com a quantidade de produtos que será adicionada ao estoque: ");
		int qtdEntrada = sc.nextInt();
		produto.adicionarProduto(qtdEntrada);
		
		System.out.println();
		System.out.println("Atualização de estoque: " + produto);
		
		System.out.println();
		System.out.print("Entre com a quantidade de produtos que será retirada do estoque: ");
		int qtdSaida = sc.nextInt();
		produto.removerProduto(qtdSaida);
		
		System.out.println();
		System.out.println("Atualização de estoque: " + produto);
		
		sc.close();
	}

}

// no Java toda Classe é uma subclasse da Classe Object
// toString = trata-se de um método da subclasse Object
// por isso todo objeto instanciado em qualquer Classe poderá acessar os métodos da Classe Object


