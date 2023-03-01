package lacosrepeticao;

import java.util.Scanner;

public class SomaImparesConsecutivosI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X, Y;
		int soma = 0;
		
		System.out.print("");
		X = sc.nextInt();

		System.out.print("");
		Y = sc.nextInt();
		
		if(X < Y) {	
			for(int cont = X; cont < Y; cont++) {
				if(cont % 2 != 0 && cont > X)
					soma = soma + cont;
					
				
			}
			
		}else if (X > Y) {
			for(int cont = X; cont > Y; cont--) {
				if(cont % 2 !=0 && cont < X)
					soma = soma + cont;
				
			}
		}
		
		
		System.out.println(soma);
		
		
		sc.close();
	}

}
