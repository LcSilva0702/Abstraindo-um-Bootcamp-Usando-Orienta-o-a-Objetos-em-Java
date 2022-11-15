import java.time.LocalDate;

import br.dio.com.desafio.dominio.Bootcamp;
import br.dio.com.desafio.dominio.Conteudo;
import br.dio.com.desafio.dominio.Curso;
import br.dio.com.desafio.dominio.Dev;
import br.dio.com.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1  = new Curso();
        Mentoria mentoria1 = new Mentoria();

        curso1.setCargaHoraria(120);
        curso1.setDescricao("Curso de java, com OO e Spring");
        curso1.setTitulo("Curso de Java");

        mentoria1.setData(LocalDate.now());
        mentoria1.setTitulo("Bootcamp java");
        mentoria1.setDescricao("Bootcamp Ifood");

        Bootcamp bootcampJavaIfood = new Bootcamp();

        bootcampJavaIfood.setNome("Bootcamp Java Potencia Tech");
        bootcampJavaIfood.getConteudos().add(curso1);
        bootcampJavaIfood.getConteudos().add(mentoria1);
        bootcampJavaIfood.setDescricao("Descricao bootcamp");

        Dev dev1 = new Dev();
        dev1.inscreverBootcamp(bootcampJavaIfood);
        dev1.setNome("Lucas");

        System.out.println("Conteudo Inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudo Inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteudo Inscritos: " + dev1.getConteudosConcluidos());
        System.out.println("Xp: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.inscreverBootcamp(bootcampJavaIfood);
        dev2.setNome("Claudinete");

        System.out.println("Conteudo Inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteudo Inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteudo Inscritos: " + dev2.getConteudosConcluidos());
        System.out.println("Xp: " + dev2.calcularTotalXp());
    }
}
