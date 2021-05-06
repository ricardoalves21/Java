package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Estudante;

public class ProgramaNotas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.println("##### NOME E NOTAS DO ALUNO #####");
		System.out.println();
		
		System.out.print("Nome: ");
		estudante.nome = sc.nextLine();
		
		System.out.print("Nota 1: ");
		estudante.nota1 = sc.nextDouble();
		
		System.out.print("Nota 2: ");
		estudante.nota2 = sc.nextDouble();
		
		System.out.print("Nota 3: ");
		estudante.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("##### RESULTADO #####");
		System.out.println();
		System.out.println(estudante);		

	}
}