package entidades;

public class Conta {
	
	// ATRIBUTOS
	private int numero;
	private String nome;
	private String resp;
	private double deposito;
	private double saldo;
	
	
	// CONSTRUTOR
	public Conta(int numero, String nome, double deposito) {
		this.numero = numero;
		this.nome = nome;
		this.deposito = deposito;
	}
	
	// CONSTRUTOR para sobrecarga
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	// METODOS MODIFICADORES
	public double getSaldo() {
		return saldo;
	}

	
	//OUTROS METODOS
	public void saldoAtual(double deposito) {
				this.saldo += deposito;
	}

	public String toString() {
		return
				"\n"
				+ "Número da Conta: "
				+ numero
				+ "\n"
				+ "Nome do Titular: "
				+ nome
				+ "\n"
				+ "Valor do depósito: "
				+ deposito
				+ "\n"
				+ "Saldo: "
				+ this.saldo;
	}


}

