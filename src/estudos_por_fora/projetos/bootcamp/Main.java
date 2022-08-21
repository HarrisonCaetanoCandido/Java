/*
 * MAIN:
 * Nome
 * conteudosInscritos
 * conteudosConcluidos
 * 
 * - Métodos:
 *   - inscrever
 *   - progredir
 *   - calcularTotalXp
 * ------------------------
 * 
 * CURSOS:
 * titulo
 * descricao
 * cargaHoraria
 * 
 * - Métodos:
 *   - calcularXp();
 * ------------------------
 *
 * MENTORIAS:
 * titulo
 * descricao
 * data
 * 
 * - Métodos:
 *   - calcularXp();
 */

package estudos_por_fora.projetos.bootcamp;

import java.time.LocalDate;
import estudos_por_fora.projetos.bootcamp.classes.*;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("curso Js");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(4);

        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now()); // pega a data de criação e faz a atribuição pelo método nativo now()

        System.out.println(curso1.getTitulo());
        System.out.println(curso1.getDescricao());
        System.out.println(curso1.getCargaHoraria() + " horas");
        System.out.println(curso2.getTitulo());
        System.out.println(curso2.getDescricao());
        System.out.println(curso2.getCargaHoraria() + " horas");

        System.out.println(mentoria.getTitulo());
        System.out.println(mentoria.getDescricao());
        System.out.println("Data de criação: " + mentoria.getData());

        Bootcamp bootcamp = new Bootcamp(); // instancia um bootcamp com dois cursos e uma mentoria
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHarrison = new Dev();
        devHarrison.setNome("Harrison");
        System.out.println("Conteúdos inscritos(antes de inscrever o dev): " + devHarrison.getConteudosInscritos());
        devHarrison.inscreverBootcamp(bootcamp);
        devHarrison.progredir(); // progredir aqui é concluir
        System.out.println("Conteúdos inscritos: " + devHarrison.getConteudosInscritos());
        System.out.println("Conteúdos inscritos: " + devHarrison.getConteudosConcluidos());
        System.out.println("Xp: " + devHarrison.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        System.out.println("Conteúdos inscritos(antes de inscrever o dev): " + devJoao.getConteudosInscritos());
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir(); // progredir aqui é concluir
        devJoao.progredir(); // progredir aqui é concluir
        devJoao.progredir(); // progredir aqui é concluir
        System.out.println("Conteúdos inscritos: " + devHarrison.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devHarrison.getConteudosConcluidos());
        System.out.println("Xp: " + devJoao.calcularTotalXp());
    }
}