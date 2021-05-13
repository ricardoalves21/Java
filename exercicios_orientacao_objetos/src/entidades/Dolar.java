package entidades;

public class Dolar {
	
	// METODOS
	public static double valorPagar(double qtdDolar, double dolar) {
		return (dolar + (dolar * 0.06)) * qtdDolar;
	}
}