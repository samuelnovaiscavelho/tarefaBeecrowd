package entrada.saidadados.operadores;

import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, SOMA;
		
		System.out.print("");
		A = sc.nextInt();
		
		System.out.print("");
		B = sc.nextInt();
		
		SOMA = A + B;
		System.out.println("SOMA = " + SOMA);
		
		sc.close();

	}

}
