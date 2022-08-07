/*
Desafio
O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, 
uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.

Você está desenvolvendo um sistema para um local de eventos, neste local, é necessário que 
a entrada seja permitida apenas para pessoas acima de 18 anos. Faça um programa para ler um número N, 
a idade de N pessoas. Depois disso, coloque a idade mínima permitida para se entrar no local, 
conforme exemplo.

Retorne às idades de quem não puder entrar.

Entrada
A entrada será composta na primeira linha pelo tamanho da array e nas linhas subsequentes 
pelas idades que preenchem essa array

Saída
A saída deverá retornar as idades que não são permitidas a entrada, conforme exemplo abaixo.
*/

package estudos_por_fora.desafios;

import java.util.*;

public class Problem_4 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int N = scan.nextInt(); // N pessoas
            int[] idade = new int[N];
            int i;

            for (i = 0; i < N; i++)
                idade[i] = scan.nextInt();

            System.out.println("Nao poderao entrar as idades: ");

            for (i = 0; i < N; i++)
                if (idade[i] < 18)
                    System.out.println(idade[i]);
        }
    }
}