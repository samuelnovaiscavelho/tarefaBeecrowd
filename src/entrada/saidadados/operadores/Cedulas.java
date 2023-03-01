package entrada.saidadados.operadores;

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.print("");
		N = sc.nextInt();
		
		int nota100 = (N/100);
		int resto100 = (N%100);
		
		int nota50 = resto100/50;
		int resto50 = resto100%50;
		
		int nota20 = resto50/20;
		int resto20 = resto50%20; 

		int nota10 = resto20/10;
		int resto10 = resto20%10; 
		
		int nota5 = resto10/5;
		int resto5 = resto10%5; 
		
		int nota2 = resto5/2;
		int resto2 = resto5%2; 

		int nota1 = resto2/1;
		
		
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		System.out.println(nota5 + " nota(s) de R$ 5,00");
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		System.out.println(nota1 + " nota(s) de R$ 1,00");
		
		sc.close();
	}

}
