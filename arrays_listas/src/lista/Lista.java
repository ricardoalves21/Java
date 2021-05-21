package lista;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>(); // esta � a maneira de instanciar uma lista no Java
		
		lista.add("Ricardo"); // adicionando itens na lista instanciada
		lista.add("Elias");
		lista.add("Juliana");
		lista.add("Henrique");
		lista.add(2, "Josiane"); // para adicionar um item na posi��o 2 da lista	
		lista.remove("Henrique"); // para remover um item da lista
		lista.remove(1); // para remover um item da lista indicando a posi��o do item
		lista.removeIf(x -> x.charAt(0) == 'R'); // para remover um item incluindo condi��es espec�ficas para isso (predicado)
		
		System.out.println(lista.size()); // imprimindo o tamanho da lista
		for (String x : lista) { // usando for each para varrer a lista e apresentar os itens contidos nela
			System.out.println(x);
		}
		System.out.println("-----------------------------");


	}

}
