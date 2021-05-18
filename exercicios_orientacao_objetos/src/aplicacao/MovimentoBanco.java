package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;


public class MovimentoBanco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		
		System.out.println("xxxxxxxxxx ABERTURA DE CONTA BANCÁRIA xxxxxxxxxx");
		System.out.println();
		
		double deposito = 0;
		double saque = 0;
		
		System.out.print("Qual é o número da conta? ");
		int numero = sc.nextInt();
		
		System.out.print("Quem é o titular da conta? ");
		String nome = sc.next();
		
/////////////////////////////////////////////////////////////////////////
		
		System.out.print("Deseja fazer um depósito inicial (s/n)? ");
		String resp = sc.next();
		
		if ("s".equals(resp)) {
			System.out.print("Qual o valor do depósito? ");
			deposito = sc.nextDouble();
			saque = 0;
		} else {
			System.out.print("Ok");
			deposito = 0;
			saque = 0;
		}
		
		Conta conta = new Conta(numero, nome);
		
		conta.saldoAtual(deposito, saque);
		
		System.out.println(conta);
		
////////////////////////////////////////////////////////////////////////
		
		System.out.println();
		System.out.print("Deseja fazer um saque ou depósito (s/n)? ");
		String resp2 = sc.next();
		String resp3 = "s";
		
		if ("s".equals(resp2)) {
			System.out.print("Saque ou depósito (s/d)? ");
			resp3 = sc.next();
			if ("s".equals(resp3)) {
				System.out.println("Qual o valor do saque?");
				saque = sc.nextDouble();
			} else if ("d".equals(resp3)) {
				System.out.print("Qual o valor do depósito? ");
				deposito = sc.nextDouble();
			}	
		} else {
			System.out.print("Ok");
			deposito = 0;
			saque = 0;
		}
		
		conta.saldoAtual(deposito, saque);
		
		System.out.println(conta);
		
////////////////////////////////////////////////////////////////////////
		
		System.out.println();
		System.out.print("Deseja fazer um saque ou depósito (s/n)? ");
		String resp4 = sc.next();
		String resp5 = "s";
		
		if ("s".equals(resp4)) {
			System.out.print("Saque ou depósito (s/d)? ");
			resp5 = sc.next();
			if ("s".equals(resp5)) {
				System.out.print("Qual o valor do saque?");
				saque = sc.nextDouble();
				deposito = 0;
			} else if ("d".equals(resp5)) {
				System.out.print("Qual o valor do depósito? ");
				deposito = sc.nextDouble();
				saque = 0;
			}	
		} else {
			System.out.print("Ok");
			deposito = 0;
			saque = 0;
		}
		
		conta.saldoAtual(deposito, saque);
		
		System.out.println(conta);
		
		sc.close();
		
	}

}
