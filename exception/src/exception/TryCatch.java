package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vet = sc.next().split(" ");
			int position = sc.nextInt();
			System.out.println(vet[position]);			
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Posição inválida");
		}
		catch (InputMismatchException e) {
			System.out.println("Erro ao inserir");
		}
		
		System.out.println("Fim do programa");
		sc.close();
	}
}
