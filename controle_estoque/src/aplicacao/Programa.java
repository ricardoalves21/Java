package aplicacao; // descri��o do pacote

// inser��o das bibliotecas
import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

public class Programa { // descri��o da classe

	public static void main(String[] args) { // in�cio do programa
	
		Locale.setDefault(Locale.US); // usando a biblioteca Locale
		Scanner sc = new Scanner(System.in); // usando a biblioteca Scanner
		
		Produto produto = new Produto(); // instanciando o objeto produto da classe Produto
		
		System.out.println("ENTRE COM O PRODUTO"); // t�tulo da aplica��o
		System.out.println("Nome: "); // solicitando ao usu�rio o nome do produto
		produto.nome = sc.nextLine(); // guardando a resposta do usu�rio no objeto produto no atributo nome
		System.out.println("Pre�o: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println(produto); // quando coloco apenas o nome do objeto no println o Java j� entende que a resposta ser� do tipo String.
		
		sc.close();
	}

}

// no Java toda Classe � uma subclasse da Classe Object
// toString = trata-se de um m�todo da subclasse Object
// por isso todo objeto instanciado em qualquer Classe poder� acessar os m�todos da Classe Object


