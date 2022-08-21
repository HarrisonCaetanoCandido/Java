package estudos_por_fora.projetos.bootcamp.classes;

public abstract class Conteudo { // abstract se refere a não permissão de instância de Conteudo
    protected static final double XP_PADRAO = 10d; // static para acessar a variavel fora da classe Conteudo xp padrão para o início de todo conteúdo
    private String titulo;
    private String descricao;

    public abstract double calcularXp(); // Toda classe que estender de Conteudo será obrigada a usar este método
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}