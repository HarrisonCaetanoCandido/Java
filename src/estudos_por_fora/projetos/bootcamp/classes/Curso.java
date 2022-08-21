package estudos_por_fora.projetos.bootcamp.classes;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {}

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}