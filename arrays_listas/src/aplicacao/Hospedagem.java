package aplicacao;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import entidade.Hotel;

public class Hospedagem {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n_quartos = 10;		
		Hotel[] quarto = new Hotel[n_quartos];
		
		System.out.println("XXXXXXXXXX HOSPEDAGEM XXXXXXXXXX");
		System.out.println();
		
		System.out.print("Quantos quartos serão alugados? ");
		int hospedagens = sc.nextInt();
			

		
		for (int i=0; i<hospedagens; i++) {
			
			System.out.print("Nome do hospede: ");
			String nome = sc.next();
			
			System.out.print("E-mail do hospede: ");
			String email = sc.next();
			
			System.out.print("Apartamento do hospede [0 a 9]: ");
			int apto = sc.nextInt();
			
			quarto[i] = new Hotel(nome, email, apto);
			
			}
			
		System.out.println();
		
		System.out.println("********** RELATORIO DE HOSPEDAGEM **********");
		System.out.println();
		
		// int ord = 0;
				
		for (int i=0; i<hospedagens; i++) {
			for (int j=0; j<hospedagens; j++) {
				System.out.println(quarto[j].getApto());
			}
			
			System.out.println(quarto[i].getApto());
		}
		
		sc.close();
	}
}
