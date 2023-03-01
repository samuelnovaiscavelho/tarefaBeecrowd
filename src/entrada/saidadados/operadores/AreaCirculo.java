package entrada.saidadados.operadores;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double π = 3.14159, raio, area;
		
		
		System.out.print("");
		raio = sc.nextDouble();
		
		area = π * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f", area);

		sc.close();

	}

}
