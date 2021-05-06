package entidades;

public class Retangulo {
	
	// ATRIBUTOS DA CLASSE
	
	public double width;
	public double height;
	
	// METODOS DA CLASSE
	
	public double area() {
		return width * height;
	}
	
	public double perimetro() {
		return (width * 2) + (height * 2);
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(width, 2)) + (Math.pow(height, 2)));
	}
	
	public String toString() {
		return 
				"Largura: " 
				+ String.format("%.2f", width) // formatando a apresentação do toString no atributo width
				+ " e Altura: " 
				+ String.format("%.2f", height) // formatando a apresentação do toString no atributo height
	;}

}