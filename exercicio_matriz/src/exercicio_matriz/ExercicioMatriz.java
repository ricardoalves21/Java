package exercicio_matriz;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qtde linhas da Matriz: ");
		int m = sc.nextInt(); // guardando a quantidade de linhas na variável primitiva 'm'
		
		System.out.print("Qtde colunas da Matriz: ");
		int n = sc.nextInt(); // guardando a quantidade de colunas na variável primitiva 'n'
		
		int[][] mat = new int[m][n]; // instanciando matriz bidimensional do tipo primitiva com 'm' linhas e 'n' colunas
		
		System.out.println();
		
		for (int i=0; i<m; i++) { // varrendo as linhas da matriz
			for (int j=0; j<n; j++) { // varrendo as colunas da matriz
				System.out.print("Digite a posição ["+i+"]["+j+"] da Matriz: "); // pergunta ao usuário
				mat[i][j] = sc.nextInt(); // guardando o valor digitado pelo usuário nas posições 'i' e 'j' da matriz
			}
		}
		
		System.out.println();
		
		System.out.println("Matriz Digitada: ");
		
		for (int i=0; i<m; i++) { // varrendo as linhas da matriz
			System.out.println(); // pulando uma linha após escrever a posição 'i' e 'j' da matriz
			for (int j=0; j<n; j++) { // varrendo as colunas da matriz 
				System.out.print(mat[i][j]+" "); // imprimindo os valores da matriz
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("Qual número quer encontrar na Matriz? ");		
		int x = sc.nextInt(); // valor que o usuário deseja encontrar na matriz
		
		System.out.println();
		
		for (int i=0; i<m; i++) { // varrendo os valores nas linhas da matriz
			for (int j=0; j<n; j++) { // varrendo os valores nas colunas da matriz
				
				if (mat[i][j] == x ) { // condição para começar a imprimir a resposta da busca para o usuário
					
					if (i == 0) {
						System.out.println("Acima: não tem");
					} else {
						System.out.println("Acima: "+mat[i-1][j]);
					} 
					
					if (j == 0) {
						System.out.println("Esquerda: não tem");
					} else {
						System.out.println("Esquerda: "+mat[i][j-1]);	
					} 
					
					if (i == m-1) {
						System.out.println("Abaixo: não tem");
					} else {
						System.out.println("Abaixo: "+mat[i+1][j]);
					} 
					
					if (j == n-1) {
						System.out.println("Direita: não tem");
					} else {
						System.out.println("Direita: "+mat[i][j+1]);	
					}
					
					System.out.println("Posição do elemento: "+i+", "+j);
				}				
			}
		}		
		sc.close();
	}
}
