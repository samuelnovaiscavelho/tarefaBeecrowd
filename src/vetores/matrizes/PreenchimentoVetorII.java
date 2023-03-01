package vetores.matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PreenchimentoVetorII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] valorN = new int[1000];

        int valorT, contador = 0;

        valorT = sc.nextInt();

        for (int i = 0; i < 1000; i++) {
        	valorN[i] = contador;
            contador += 1;
            if (contador == valorT)
                contador = 0;
        }

        for (int j = 0; j < 1000; j++) {
            System.out.println("N[" + j + "] = " + valorN[j]);
        }

    }
}