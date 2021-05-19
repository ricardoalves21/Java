package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Hotel;

public class Hospedagem {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n_quartos = 2;
		Hotel[] quarto = new Hotel[n_quartos];
			
		System.out.println("XXXXXXXXXX HOSPEDAGEM XXXXXXXXXX");
		
		for (int i=0; i<quarto.length; i++) {
			
			System.out.print("Nome do hospede: ");
			String nome = sc.next();
			
			System.out.print("E-mail do hospede: ");
			String email = sc.next();
			
			System.out.print("Apartamento do hospede [0 a 9]: ");
			int ap = sc.nextInt();
			
			quarto[ap] = new Hotel(nome, email);
			
		}		
		
		for (int i=0; i<quarto.length; i++) {
			System.out.println(i + ": " + quarto[i].getNome() + ", " + quarto[i].getEmail());
		}
		
		sc.close();
	}

}
