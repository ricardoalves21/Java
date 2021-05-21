package lista;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>(); // esta é a maneira de instanciar uma lista no Java
		
		lista.add("Ricardo");
		lista.add("Elias");
		lista.add("Juliana");
		lista.add("Henrique");
		
		for (String x : lista) {
			System.out.println(x);
		}

	}

}
