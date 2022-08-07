/*
Desafio
Faça um programa com as características abaixo:

Leia 10 nomes, sem espaço em branco;
Imprima o terceiro nome da lista;
Imprima o sétimo nome da lista;
Imprima o nono nome da lista.

Entrada
A entrada consiste vários arquivos de teste, cada um com dez linhas e em cada linha tem um nome de no 
até 30 caracteres e sem espaço em branco. Conforme mostrado no exemplo de entrada a seguir.

Saída
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, 
gere três linhas conforme os procedimentos 2, 3 e 4. Use o exemplo abaixo para clarear o que 
está sendo pedido.
*/

package estudos_por_fora.desafios;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        int i;
        try (Scanner sc = new Scanner(System.in)) {
            String[] nomes = new String[10];
            String[] nome1 = new String[3];

            for (i = 0; i < 10; i++)
            {
                nomes[i] = sc.next(); // ler todos os nomes
 
                if (i == 2)
                    nome1[0] = nomes[i];

                if(i == 6)
                    nome1[1] = nomes[i];

                if(i == 8)
                    nome1[2] = nomes[i];
            }

            if(nome1[0] != null)
                System.out.println(nome1[0]);

            if(nome1[1] != null)
                System.out.println(nome1[1]);

            if(nome1[2] != null)
                System.out.println(nome1[2]);
        }
    }
}