package entidades;

public class Estudante {
	
	// ATRIBUTOS
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	// METODOS
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double media() {
		return this.notaFinal() / 3; // usando outro m�todo da classe para calcular
	}
	
	public String resultado() {
		if (this.notaFinal() < 60.00) { // criando condi��o com um m�todo desta classe
			double faltou = 60.00 - this.notaFinal(); // realizando c�lculo com um m�todo desta mesma classe
			return "Reprovado\nFALTOU: " + String.format("%.2f", faltou); // usando o String.format no return do m�todo	
		} else {
			return "Aprovado!";			
		}
	}
	
	public String toString() {
		return
				"ALUNO: " 
				+ nome
				+ "\n" // salto de linha
				+ "NOTA FINAL: "
				+ String.format("%.2f", notaFinal())
				+ "\n"
				+ "SITUA��O: "
				+ resultado() // apresentando o return de um m�todo no toString
	;}
}
