// ALGORÍTMO DE ORDENAÇÃO - BUBBLE SORT

public class Aula_3 {
    public static void main(String[] args) {
        int vetor[] = {3, 10, 11, 5, 14, 20, 1, 6, 3, 2, 7};
        int i, j, aux;

        for(i = 0; i < vetor.length; i++)
            for(j = 0; j < vetor.length; j++)
                if(vetor[i] < vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }

        for(i = 0; i < vetor.length; i++)
            System.out.println(vetor[i]);
    }
}