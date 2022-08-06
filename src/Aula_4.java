// VETORES MULTIDIMENSIONAIS

import java.util.Scanner;

public class Aula_4 {
    public static void main(String[] args) {
        double[][] x = new double[3][3];
        int i, j;

        Scanner input = new Scanner(System.in);

        for (i = 0; i < x.length; i++) // tamanho do vetor x
            for (j = 0; j < x.length; j++) { // tamanho do vetor do vetor x[i]
                System.out.print("Digite o valor de x[" + i + "][" + j + "]" + ": ");
                x[i][j] = input.nextDouble();
            }

        for (i = 0; i < x.length; i++)
            for (j = 0; j < x.length; j++)
                System.out.println("x[" + i + "][" + j + "]" + ": " + x[i][j]);
    }
}