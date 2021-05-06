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
	
	public String toString() { // este método serve para apresentar as informações atualizadas deste classe
		return
				"Nome: "
				+ nome
				+ "\n"
				+ "Salário Líquido: "
				+ String.format("%.2f", salarioLiquido()) // formatando a apresentação do metodo salarioLiquido()
				+ "\n"
	;}

}
