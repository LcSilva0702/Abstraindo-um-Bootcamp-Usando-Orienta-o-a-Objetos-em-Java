import java.time.LocalDate;

import br.dio.com.desafio.dominio.Curso;
import br.dio.com.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1  = new Curso();
        Mentoria mentoria1 = new Mentoria();

        curso1.setCargaHoraria(120);
        curso1.setDescricao("Curso de java, com OO e Spring");
        curso1.setTitulo("Curso de Java");

        mentoria1.setData(LocalDate.now());
    }
}
