import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição");
        curso2.setCargaHoraria(4);

        System.out.println(curso1.toString());
        System.out.println(curso2.toString());

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Descrição Mentoria");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria.toString());

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDiogo = new Dev();
        devDiogo.setNome("Diogo");
        devDiogo.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos Diogo: " + devDiogo.getConteudosIncritos());
        devDiogo.progredir();
        System.out.println("Conteúdos Inscritos Diogo: " + devDiogo.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Diogo: " + devDiogo.getConteudosConcluidos());
        System.out.println("XP: " + devDiogo.calcularTotalXp());

        System.out.println("------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosIncritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("------------------------------");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
}
