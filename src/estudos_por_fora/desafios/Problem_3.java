/*
Desafio
Sabemos que você adora passar horas jogando jogos como Liga of Legendas (LOL) 
e Contra-Strike (CS). LOL pode ser o seu queridinho, mas você também gosta de usar todas suas grandes 
habilidades no Contra-Strike!

Com tanto treinamento, você começou a fazer vídeos das suas jogadas, e eles estão sempre sendo 
exibidos na JV - Jogadores Viciados, uma página na internet que publica gameplays dos alunos da 
universidade.

Como a página têm muitos acessos, está sempre publicando material novo, isso pode dificultar na hora 
de tentar encontrar algum vídeo específico. Entretanto, como você é programador e domina a artes 
de conseguir o que quer por meio do código, você decidiu escrever um programa para encontrar os seus
vídeos na página. Dada a lista de gameplays publicados na página, determine quantos de suas gameplays 
de Contra-Strike foram publicadas.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso contém dois inteiros 
N e I (1 ≤ N ≤ 104, 1000 ≤ I ≤ 9999), o número de gameplays publicados na página e o seu 
identificador na universidade, respectivamente.

As próximas N linhas descrevem os gameplays publicados. Cada gameplay é descrito por dois inteiros 
i e j (1000 ≤ i ≤ 9999, j=0 ou 1), onde i é o identificador na universidade do autor do gameplay, 
e j=0 se o gameplay é de Contra-Strike, ou j=1 se é de Liga of Legendas.

A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima uma única linha com um número indicando quantos gameplays 
seus de Contra-Strike foram publicados na página.
 */

package estudos_por_fora.desafios;

import java.util.*;

public class Problem_3 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int number, id;
            int count = 0;
            int id1, num;

            number = sc.nextInt(); // 1 <= N <= 104, numero de gameplays publicadas
            id = sc.nextInt(); // 1000 <= Id <= 9999, identificador do aluno na universidade (tipo um RA)

            while (number > 0 && number <= 104) { // N linhas descrevem as N gameplays publicadas

                id1 = sc.nextInt(); // inteiro I: 1000 <= I <= 9999 => Identificador na universidade daquela gameplay
                num = sc.nextInt(); // inteiro J: J = 0 ou J = 1 => Identifica se o jogo é CS ou LOL

                if (id == id1 && num == 0) // quer saber quantas gameplays de CS foram publicadas
                    count++;

                number--;
            }
            System.out.println(count);
        }
    }
}