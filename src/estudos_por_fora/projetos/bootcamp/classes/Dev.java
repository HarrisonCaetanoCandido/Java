package estudos_por_fora.projetos.bootcamp.classes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); // LinkedHashSet deixa ordenado por inscrição sem repetição
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); // LinkedHashSet deixa ordenado por conclusão sem repetição

    public Dev() {}

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos()); // pega todos os conteudos do bootcamp e coloca em conteudos inscritos
        bootcamp.getDevsInscritos().add(this); // Adiciona esse dev na lista de Devs inscritos em bootcamps
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst(); // pega o primeiro conteudo
        
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get()); // toda a informacao em conteudo eh passada para conteudosConcluidos
            this.conteudosInscritos.remove(conteudo.get()); // remove o conteudo da primeira lista
        } else {
            System.err.println("Você não está matriculado(a) em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum(); // soma do xp de todos os conteudos da lista conteudos concluidos
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) { // não permite a inserção de objetos iguais tanto na inscrição quanto na conclusão de conteúdos
        if(this == o) 
            return true;

        if(o == null || getClass() != o.getClass())
            return false;
        
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() { // atribui um hashcode a cada conteudo para fazer a ordenação
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
