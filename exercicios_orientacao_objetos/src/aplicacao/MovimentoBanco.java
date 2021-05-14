package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.functions.Function;

import entidades.Conta;


public class MovimentoBanco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("xxxxxxxxxx ABERTURA DE CONTA BANCÁRIA xxxxxxxxxx");
		System.out.println();
		
		System.out.print("Qual é o número da conta? ");
		int numero = sc.nextInt();
		
		System.out.print("Quem é o titular da conta? ");
		String nome = sc.next();
		
		System.out.println("Quer realizar um depósito (s/n)? ");
		String resp = sc.next();

		
		Conta conta = new Conta(numero, nome, deposito);
		
		conta.saldoAtual(deposito);		
		
		
		
		System.out.println(conta);
		
		
		
		
		
		

	}

}
