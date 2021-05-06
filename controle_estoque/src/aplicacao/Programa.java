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
		System.out.println("Nome: "); // solicitando ao usuário o nome do produto
		produto.nome = sc.nextLine(); // guardando a resposta do usuário no objeto produto no atributo nome
		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println(produto); // quando coloco apenas o nome do objeto no println o Java já entende que a resposta será do tipo String.
		
		sc.close();
	}

}

// no Java toda Classe é uma subclasse da Classe Object
// toString = trata-se de um método da subclasse Object
// por isso todo objeto instanciado em qualquer Classe poderá acessar os métodos da Classe Object


