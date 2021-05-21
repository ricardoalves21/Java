package aplicacao;

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
		
		System.out.println("Quantos quartos para hospedar? ");
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
		
		for (Hotel lista : quarto) { // para cada objeto 'lista' contido no vetor 'quarto' do tipo Hotel' faça...
			System.out.println(lista); // imprimir na tela o objeto 'lista'
		}	
		
		
//		for (int i=0; i<hospedagens; i++) {
//			System.out.println(quarto[i].getApto());
//			for (int j=0; j<hospedagens; j++) {
//				System.out.println(quarto[j].getApto());
//			}
//		}
			
	
		sc.close();
	}
}