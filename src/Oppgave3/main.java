package Oppgave3;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {


        List<Ansatt> people = Arrays.asList(
                new Oppgave3.Ansatt("Henrik", "Olsen", "Mann", "CEO", 1000000),
                new Oppgave3.Ansatt("Karl", "Olafsen", "Mann", "CFO", 900000),
                new Oppgave3.Ansatt("Guri", "Hansen", "Kvinne", "CTO", 900000),
                new Oppgave3.Ansatt("Trond", "Larsen", "Mann", "Senior Utvikler", 550000),
                new Oppgave3.Ansatt("Line", "Fyllingen", "Kvinne", "Junior Utvikler ", 450000));


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Oppgave 3a
        System.out.println("Oppgave 3a");

        List<String> etternavn = people.stream()
                .map(Ansatt::getEtternavn)
                .collect(Collectors.toList());
        System.out.println(etternavn);

        //Oppgave 3b
        System.out.println("Oppgave 3b");

        people.stream()
                .filter(p -> p.getKjonn().equals("Kvinne"))
                .forEach(System.out::println);

        //Oppgave 3c
        System.out.println("Oppgave 3c");

        //Oppgave 3d

        System.out.println("Oppgave 3d");
        //Oppgave 3e

        System.out.println("Oppgave 3e");
        //Oppgave 3f

        System.out.println("Oppgave 3f");
        //Oppgave 3g

        System.out.println("Oppgave 3g");

        //Oppgave 3h

        System.out.println("Oppgave 3h");


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  }
}
