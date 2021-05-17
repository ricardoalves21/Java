package arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas posições o vetor terá? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Qual o valor da posição " + i + ": ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		for (int i=0; i<n; i++) {
			soma += vetor[i];
		}
		
		double media = soma / n;
		
		System.out.println("A soma do vetor é igual a " + soma);
		System.out.println("A média dos valores desse vetor é igual a " + media);
		
		sc.close();
	}
}
