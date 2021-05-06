package aplicacao; // descrição do pacote

// inserção das bibliotecas
import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

public class Programa { // descrição da classe

	public static void main(String[] args) { // início do programa
	
		Locale.setDefault(Locale.US); // usando a biblioteca Locale
		Scanner sc = new Scanner(System.in); // usando a biblioteca Scanner
		
		Produto produto = new Produto(); // instanciando o objeto produto da classe Produto
		
		System.out.println("ENTRE COM O PRODUTO"); // título da aplicação
		System.out.println();
		
		System.out.print("Nome: "); // solicitando ao usuário o nome do produto
		produto.nome = sc.nextLine(); // guardando a resposta do usuário no objeto produto no atributo nome
		
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
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


