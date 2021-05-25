package exercicio_matriz;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qtde linhas da Matriz: ");
		int m = sc.nextInt(); // guardando a quantidade de linhas na vari�vel primitiva 'm'
		
		System.out.print("Qtde colunas da Matriz: ");
		int n = sc.nextInt(); // guardando a quantidade de colunas na vari�vel primitiva 'n'
		
		int[][] mat = new int[m][n]; // instanciando matriz bidimensional do tipo primitiva com 'm' linhas e 'n' colunas
		
		System.out.println();
		
		for (int i=0; i<m; i++) { // varrendo as linhas da matriz
			for (int j=0; j<n; j++) { // varrendo as colunas da matriz
				System.out.print("Digite a posi��o ["+i+"]["+j+"] da Matriz: "); // pergunta ao usu�rio
				mat[i][j] = sc.nextInt(); // guardando o valor digitado pelo usu�rio nas posi��es 'i' e 'j' da matriz
			}
		}
		
		System.out.println();
		
		System.out.println("Matriz Digitada: ");
		
		for (int i=0; i<m; i++) { // varrendo as linhas da matriz
			System.out.println(); // pulando uma linha ap�s escrever a posi��o 'i' e 'j' da matriz
			for (int j=0; j<n; j++) { // varrendo as colunas da matriz 
				System.out.print(mat[i][j]+" "); // imprimindo os valores da matriz
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("Qual n�mero quer encontrar na Matriz? ");		
		int x = sc.nextInt(); // valor que o usu�rio deseja encontrar na matriz
		
		System.out.println();
		
		for (int i=0; i<m; i++) { // varrendo os valores nas linhas da matriz
			for (int j=0; j<n; j++) { // varrendo os valores nas colunas da matriz
				
				if (mat[i][j] == x ) { // condi��o para come�ar a imprimir a resposta da busca para o usu�rio
					
					if (i == 0) {
						System.out.println("Acima: n�o tem");
					} else {
						System.out.println("Acima: "+mat[i-1][j]);
					} 
					
					if (j == 0) {
						System.out.println("Esquerda: n�o tem");
					} else {
						System.out.println("Esquerda: "+mat[i][j-1]);	
					} 
					
					if (i == m-1) {
						System.out.println("Abaixo: n�o tem");
					} else {
						System.out.println("Abaixo: "+mat[i+1][j]);
					} 
					
					if (j == n-1) {
						System.out.println("Direita: n�o tem");
					} else {
						System.out.println("Direita: "+mat[i][j+1]);	
					}
					
					System.out.println("Posi��o do elemento: "+i+", "+j);
				}				
			}
		}		
		sc.close();
	}
}
