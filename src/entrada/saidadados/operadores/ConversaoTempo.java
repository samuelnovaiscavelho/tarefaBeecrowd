package entrada.saidadados.operadores;

import java.util.Scanner;

public class ConversaoTempo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,seg,min,h;
		//horas:minutos:segundos
		
		
		System.out.print("");
		N = sc.nextInt();
		
		h = N / 3600;
		min = ((N % 3600)/60);
		seg = N % 60;
				
		System.out.println(h+":"+ min +":"+seg);
		
		
		sc.close();
	}

}
