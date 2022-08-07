// LEITURA DO TECLADO

package estudos_por_fora.aulas;
import java.util.Scanner; // importar quando for usar o Scanner input

public class Aula_1 { // nome da classe precisa ser igual ao do arquivo
    // dentro das classes temos os metodos, executar operacoes matematicas ou outras
    // acoes parecidas etc
    public static void main(String[] args) { // metodo principal, eh tipo a funcao main em c (ponto inicial do codigo)
        int x;
        double y, resultado;
        String pnome, snome;

        x = 20;
        y = 10.5;

        // Inteiro:
        System.out.println(x + " Paos com mortadela"); // println quebra a linha na impressao, \n tambem

        // Double:
        resultado = x * y;
        System.out.println("Resultado = x * y = " + resultado);

        try (Scanner input = new Scanner(System.in)) {
            // Ler números do teclado:
            System.out.println("Digite um valor inteiro para X: ");
            x = input.nextInt(); // eh tipo um scanf em C

            System.out.println("Digite um valor double para Y: ");
            y = input.nextDouble();

            // Resultado da leitura do teclado:
            System.out.println("Resultado = x * y = " + resultado);

            // Ler string do teclado:
            System.out.println("Digte seu primeiro nome: ");
            pnome = input.next();

            System.out.println("Digte seu segundo nome: ");
            snome = input.next();

            System.out.println("Digite sua idade: ");
            x = input.nextInt();
        }

        System.out.print("Olá " + pnome + " " + snome + ", ");

        if (x < 18)
            System.out.println("você é menor de idade!");
        else
            System.out.println("você é maior de idade!");
    }
}