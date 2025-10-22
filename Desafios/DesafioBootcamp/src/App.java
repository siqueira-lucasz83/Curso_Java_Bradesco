import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Aprenda os fundamentos de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Spring Boot");
        curso2.setDescricao("Aprenda a criar APIs com Spring");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Carreira Dev");
        mentoria.setDescricao("Dicas para evoluir na carreira de desenvolvedor");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp completo de Java e Spring");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos: " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("Conteúdos Concluídos: " + devLucas.getConteudosConcluidos());
        System.out.println("XP Total: " + devLucas.calcularTotalXp());
    }
}
