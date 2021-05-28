package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.ContratoHora;
import entidade.Departamento;
import entidade.Trabalhador;
import entidade.enums.NivelTrabalhador;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.next();
		System.out.println("Entre com os dados do trabalhador:");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.next();
		System.out.print("Nível: ");
		String nivelTrabalhador = sc.next();
		System.out.print("Salário Base: ");
		double salarioBase = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos para este trabalhador?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Entre com os dados do contrato #" + i + ": ");
			System.out.print("Entre com a data (DD/MM/YYYY): ");
			Date dataContrato = dt.parse(sc.next());
			System.out.print("Valor por hora: ");
			Double valorPorHora = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int horas = sc.nextInt();
			ContratoHora contrato = new ContratoHora(dataContrato, valorPorHora, horas);
			trabalhador.addContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Entre com o mês e ano para calcular o salário (MM/YYYY): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0,2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento());
		System.out.println("Renda: " + mesAno + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));
		
		sc.close();
	}

}
