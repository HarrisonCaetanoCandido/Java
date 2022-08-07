package estudos_por_fora.aulas.pacotes;

public class TV {
    public String fabricante = "Sony";
    public int volume = 0;
    public int canal = 1;
    public int polegadas = 32;
    public boolean ligado = false;

    public void aumentarVolume() {
        if (volume >= 10)
            return;

        volume++;
    }

    public void diminuirVolume() {
        if (volume == 0)
            return;

        volume--;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }
}
