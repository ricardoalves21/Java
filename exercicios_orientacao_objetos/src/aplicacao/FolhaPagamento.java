package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class FolhaPagamento {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario(); // instanciando o objeto funcionario
		
		System.out.println("ENTRE COM OS DADOS DO FUNCIONARIO");
		System.out.println();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Sal�rio Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		// APRESENTANDO AS INFORMA��ES AT� AQUI DIGITADAS
		System.out.println();
		System.out.println("INFORMA��ES ATUAIS");
		System.out.println();
		System.out.println(funcionario);
		
		System.out.print("Qual ser� o percentual de aumento salarial? ");
		double aumento = sc.nextDouble(); // criando a vari�vel aumento
		funcionario.aumentoSalarial(aumento); // usando o valor da variavel aumento para calcular o aumentoSalarial

		// APRESENTANDO O RESULTADO FINAL PARA O USU�RIO
		System.out.println();
		System.out.println("DADOS ATUALIZADOS: ");		
		System.out.println();
		System.out.println(funcionario);
		System.out.println();
		
		sc.close();
	}

}
