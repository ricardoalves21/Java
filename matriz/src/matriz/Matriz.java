package matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dimens�o da Matriz: ");
		int n = sc.nextInt(); // definindo a vari�vel que ir� guardar os valores em cada posi��o da matriz
		
		int[][] mat = new int[n][n]; // instanciando uma matriz com o tipo primitivo 'int' que possui 'n' linhas e 'n' colunas (bidimensional). 
		
		
		for (int i=0; i<n; i++) { // iniciando a varredura da matriz pelas linhas (de 0 a 3)
			for (int j=0; j<n; j++) {
				System.out.print("Digite a posi��o da matriz["+i+"]["+j+"]: "); // iniciando a varredura da matriz pelas colunas (de 0 a 3)
				mat[i][j] = sc.nextInt(); // guardando o valor digitado pelo usu�rio nas posi��es 'i' e 'j'
			}
		}
		System.out.println();
		
		System.out.print("Diagonal Principal: "); // imprimir na tela esse texto
		for (int i=0; i<n; i++) { // varrendo a matriz apenas com a vari�vel 'i' valendo de 0 a 3
			System.out.print(mat[i][i]+" "); // imprimindo a matriz onde os valores na linha e coluna s�o iguais
		}
		System.out.println();
		
		int count = 0; // criando a vari�vel 'count' e inicializando com o valor 0
		 for (int i=0; i<n; i++) { // atribuindo os valores para a vari�vel 'i'
			 for (int j=0; j<n; j++) { // atribuindo os valores para a vari�vel 'j'
				 if (mat[i][j] < 0) { // condi��o para imprimir a matriz nas posi��es 'i' e 'j'
					 count++; //acumulando valores na vari�vel 'count'
				 }			 
			 }
		 }
		System.out.print("N�meros negativos: " + count); // imprimindo a vari�vel 'count'
		
		sc.close();
	}

}
