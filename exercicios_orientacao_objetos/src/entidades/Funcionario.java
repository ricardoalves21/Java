package entidades;

public class Funcionario {
	
	// ATRIBUTOS DA CLASSE	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	// METODOS DA CLASSE
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentoSalarial (double aumento) {
		this.salarioBruto += (this.salarioBruto * (aumento / 100));
	}
	
	public String toString() { // este m�todo serve para apresentar as informa��es atualizadas deste classe
		return
				"Nome: "
				+ nome
				+ "\n"
				+ "Sal�rio L�quido: "
				+ String.format("%.2f", salarioLiquido()) // formatando a apresenta��o do metodo salarioLiquido()
				+ "\n"
	;}

}
