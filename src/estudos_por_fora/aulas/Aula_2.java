// OPERAÇÕES MATEMÁTICAS BÁSICAS

package estudos_por_fora.aulas;
import java.util.Scanner;

public class Aula_2 {
    public static void main(String[] args) {
        int i, n = 6;
        double media;
        double[] notasAlunos = new double[50];

        try (Scanner input = new Scanner(System.in)) {
            i = 0;
            while (i < n) {
                System.out.print("Informe a nota do " + (i + 1) + " aluno: ");
                notasAlunos[i] = input.nextDouble();
                i++;
            }
        }

        for (i = 0; i < notasAlunos.length; i++)
            System.out.println("Nota do aluno " + (i + 1) + ": " + notasAlunos[i]);

        media = 0;
        for (i = 0; i < notasAlunos.length; i++)
            media += notasAlunos[i];

        media /= notasAlunos.length;

        System.out.println("Média da Turma: " + media);
    }
}