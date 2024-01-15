package one.digitalinnovation;


import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Colections");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Introdução");
        curso2.setCargaHoraria(11);


        Conteudo conteudo = new Curso();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);


        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devDadal = new Dev();
        devDadal.setNome("Adalberto");
        devDadal.inscreverBootCamp(bootCamp);
        System.out.println("Contéudos Inscritos Dadal" + devDadal.getConteudosInscritos());
        devDadal.progredir();
        devDadal.progredir();
        System.out.println("-");
        System.out.println("Contéudos Inscritos Dadal" + devDadal.getConteudosInscritos());
        System.out.println("Contéudos Concluídos Dadal" + devDadal.getConteudosConcluidos());

        System.out.println("XP: " + devDadal.calcularTotalXp());

        System.out.println("------");

        Dev devBiasi = new Dev();
        devBiasi.setNome("Gustavo");
        devBiasi.inscreverBootCamp(bootCamp);
        System.out.println("Contéudos Inscritos Biasi " + devBiasi.getConteudosInscritos());
        devBiasi.progredir();
        devBiasi.progredir();
        devBiasi.progredir();
        System.out.println("-");

        System.out.println("Contéudos Inscritos Biasi " + devBiasi.getConteudosInscritos());
        System.out.println("Contéudos Concluídos Biasi" + devBiasi.getConteudosConcluidos());
        System.out.println("XP: " + devBiasi.calcularTotalXp());
    }
}