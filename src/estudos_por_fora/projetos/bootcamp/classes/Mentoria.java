package estudos_por_fora.projetos.bootcamp.classes;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data; // classe nativa do Java para trabalhar com data

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
