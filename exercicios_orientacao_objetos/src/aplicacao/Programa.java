package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // setando o padrão de apresentação do idioma no programa
		Scanner sc = new Scanner(System.in); // criando o objeto sc para monitorar a entrada de dados no programa
		
		Retangulo retangulo = new Retangulo(); // instanciando o objeto retangulo o qual já possui os atributos width e height
		
		System.out.println("ENTRE COM AS MEDIDAS DO RETANGULO");
		System.out.println();
		
		System.out.print("Width: ");
		retangulo.width = sc.nextDouble(); // guardando o valor digitado pelo usuário no atributo width do objeto retangulo
		
		System.out.print("Heigth: ");
		retangulo.height = sc.nextDouble(); // guardando o valor digitado pelo usuário no atributo height do objeto retangulo
		
		System.out.println();
		System.out.println("DADOS DO RETANGULO");
		System.out.println();
		
		System.out.println(retangulo);
		System.out.printf("AREA: %.2f%n", retangulo.area()); // apresentando o resultado calculado pelo método AREA da classe Retangulo 
		System.out.printf("PERIMETRO: %.2f%n", retangulo.perimetro()); // apresentando o resultado calculado pelo método PERIMETRO da classe Retangulo
		System.out.printf("DIAGONAL: %.2f%n", retangulo.diagonal()); // apresentando o resultado calculado pelo método DIAGONAL da classe Retangulo
		System.out.println();
		
		sc.close();
	}

}