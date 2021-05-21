package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>(); // esta é a maneira de instanciar uma lista no Java
		
		lista.add("Ricardo"); // adicionando itens na lista instanciada
		lista.add("Elias");
		lista.add("Juliana");
		lista.add("Henrique");
		lista.add(2, "Josiane"); // para adicionar um item na posição 2 da lista
		System.out.println(lista.size()); // imprimindo o tamanho da lista
		
		for (String x : lista) { // usando for each para varrer a lista e apresentar os itens contidos nela			
			System.out.println(x);
		}
		System.out.println("-----------------------------");
				
		lista.remove("Henrique"); // para remover um item da lista
		lista.remove(1); // para remover um item da lista indicando a posição do item
		lista.removeIf(x -> x.charAt(0) == 'R'); // para remover um item incluindo condições específicas para isso (predicado)		
		System.out.println(lista.size()); // imprimindo o tamanho da lista
		for (String x : lista) { // usando for each para varrer a lista e apresentar os itens contidos nela			
			System.out.println(x);
		}		
		System.out.println("-----------------------------");

		System.out.println("Indexar Juliana: " + lista.indexOf("Juliana")); // fiz uma busca indexada para encontrar na lista o item 'Juliana'
		System.out.println("-----------------------------");
		
		System.out.println("Indexar Marcio: " + lista.indexOf("Marcio")); // quando o indexOf não encontra o item ele escreve '-1'
		System.out.println("-----------------------------");
		
		List<String> filtro = lista.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList()); // instanciei um novo objeto do tipo List, converti para stream, adicionei um filtro (filter) e inclui o predicado da busca, depois converti esse objeto para o tipo List novamente. 
		for (String x : filtro) { // usando for each para varrer a lista e apresentar os itens contidos nela			
			System.out.println(x);
		}	
		System.out.println("-----------------------------");
		
		String nome = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); // instanciei uma variável que recebe em seu conteúdo o objeto lista filtrado cujos predicados seja com inicial com a letra 'J' e caso ele não seja encontrado retornar null  
		System.out.println(nome);
	}

}
