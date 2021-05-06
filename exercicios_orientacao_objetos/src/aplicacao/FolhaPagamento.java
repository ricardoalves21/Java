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
		
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		// APRESENTANDO AS INFORMAÇÕES ATÉ AQUI DIGITADAS
		System.out.println();
		System.out.println("INFORMAÇÕES ATUAIS");
		System.out.println();
		System.out.println(funcionario);
		
		System.out.print("Qual será o percentual de aumento salarial? ");
		double aumento = sc.nextDouble(); // criando a variável aumento
		funcionario.aumentoSalarial(aumento); // usando o valor da variavel aumento para calcular o aumentoSalarial

		// APRESENTANDO O RESULTADO FINAL PARA O USUÁRIO
		System.out.println();
		System.out.println("DADOS ATUALIZADOS: ");		
		System.out.println();
		System.out.println(funcionario);
		System.out.println();
		
		sc.close();
	}

}
