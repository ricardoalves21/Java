package arrays_listas;

import java.util.Locale;
import java.util.Scanner;
import entidade.Produto;

public class vetor2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas posições o vetor terá? ");
		int n = sc.nextInt();
		
		Produto[] vetor = new Produto[n];
		
		for (int i=0; i<vetor.length; i++) {			
			System.out.print("Nome do Produto: ");
			String nome = sc.next();			
			System.out.print("Preço do Produto: ");
			double preco = sc.nextDouble();			
			vetor[i] = new Produto(nome, preco);
		}
		
		double soma = 0;
			
		for (int i=0; i<vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
			
		double media = soma / vetor.length;
		
		System.out.printf("A média dos preços é: %.2f", media);
			
		sc.close();

	}

}
