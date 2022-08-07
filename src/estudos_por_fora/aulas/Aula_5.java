package estudos_por_fora.aulas;
import estudos_por_fora.aulas.pacotes.TV;

class Aula_5 {
    public static void main(String[] args) {
        TV televisao1 = new TV(); // tipo_objeto nome_objeto = requisita_memoria inicialização_objeto();

        System.out.println("Esta televisão é da marca " + televisao1.fabricante + ".A televisão está " +
                (televisao1.ligado == true ? "ligada" : "desligada") + "O volume é " + televisao1.volume);

        televisao1.ligar();
        televisao1.aumentarVolume();
        televisao1.aumentarVolume();

        System.out.println("Esta televisão é da marca " + televisao1.fabricante + ".A televisão está " +
                (televisao1.ligado == true ? "ligada" : "desligada") + "O volume é " + televisao1.volume);
    }
}
