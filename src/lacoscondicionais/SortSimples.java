package lacoscondicionais;

import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1, valor2, valor3, cont  = 0;

		System.out.print("");
		valor1 = sc.nextInt();
		int guardaValor1 = valor1;
		

		System.out.print("");
		valor2 = sc.nextInt();
		int guardaValor2 = valor2;

		System.out.print("");
		valor3 = sc.nextInt();
		int guardaValor3 = valor3;
		
		if (valor1 > valor2) {
			cont = valor1;
			valor1 = valor2;
			valor2 = cont;			
		}

		if (valor2 > valor3) {
			cont = valor3;
			valor3 = valor2;
			valor2 = cont;
		}

		if (valor1 > valor2) {
			cont = valor1;
			valor1 = valor2;
			valor2 = cont;
		}

		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3 + "\n");
		System.out.println(guardaValor1);
		System.out.println(guardaValor2);
		System.out.println(guardaValor3);

		sc.close();
	}

}