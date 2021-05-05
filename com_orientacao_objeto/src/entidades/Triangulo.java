package entidades;

public class Triangulo {
	
	// DECLARANDO OS ATRIBUTOS DA CLASSE

	public double a;
	public double b;
	public double c;
	
	// DECLARANDO O MÉTODO DA CLASSE

	public double area() {
		double p = (a + b + c) / 2.00;
		return Math.sqrt(p * (p - a) * (p - b ) * (p - c));
		
	}	
	
}