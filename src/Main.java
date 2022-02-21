import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Curso Java", "Descrição",40);
        System.out.println(curso.toString());

        Mentoria mentoria = new Mentoria("Mentoria Java", "Descrição", LocalDate.now());
        System.out.println(mentoria.toString());


    }
}
