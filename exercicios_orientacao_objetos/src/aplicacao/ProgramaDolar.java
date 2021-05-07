package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Dolar;

public class ProgramaDolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o preço do dolar? ");
		double dolar = sc.nextDouble();
		
		System.out.print("Quantos dolares serão comprados? ");
		double qtdDolar = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em reais: %.2f", Dolar.valorPagar(qtdDolar, dolar));
		
		sc.close();
	}
}