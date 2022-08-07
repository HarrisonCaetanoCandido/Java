/*
Desafio
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que 
o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Entrada
O arquivo de entrada contém um valor inteiro N na primeira linha. 
Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.

Saída
Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
*/

package estudos_por_fora.desafios;

import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Problem_2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int casos = input.nextInt(); // recebe N
            double[] media = new double[casos]; // vai guardar as N medias
            double a;
            double b;
            double c;
            int cont = 0;

            while (cont < casos) {

                a = input.nextDouble(); // recebe a nota 1
                b = input.nextDouble(); // recebe a nota 2
                c = input.nextDouble(); // recebe a nota 3

                a *= 2;
                b *= 3;
                c *= 5;

                a = (a + b + c) / 10;

                media[cont] = a;

                BigDecimal bd = new BigDecimal(media[cont]).setScale(1, RoundingMode.HALF_UP); // Classe que vai arredondar
                                                                                               // para x casas decimais
                media[cont] = bd.doubleValue();

                cont++;
            }

            cont = 0;
            while (cont < casos) {
                System.out.println(media[cont]);
                cont++;
            }
        }
    }
}