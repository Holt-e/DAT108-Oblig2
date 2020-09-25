package Oppgave3;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class main {

    public static void main(String[] args) {


        List<Ansatt> people = Arrays.asList(
                new Ansatt("Henrik", "Olsen", "Mann", "Sjef", 1000000),
                new Ansatt("Karl", "Olafsen", "Mann", "IT Sjef", 900000),
                new Ansatt("Guri", "Hansen", "Kvinne", "IT utvikler", 900000),
                new Ansatt("Trond", "Larsen", "Mann", "Senior Utvikler", 550000),
                new Ansatt("Line", "Fyllingen", "Kvinne", "Junior Utvikler ", 450000));


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Oppgave 3a
        System.out.println("Oppgave 3a");

        List<String> etternavn = people.stream()
                .map(Ansatt::getEtternavn)
                .collect(Collectors.toList());
        System.out.println(etternavn + "\n");

        //Oppgave 3b
        System.out.println("Oppgave 3b");

        int antallKvinner = (int) people.stream()
                .filter(p -> p.getKjonn().equals("Kvinne"))
                .count();
                System.out.println("Antall kvinner: " + antallKvinner + "\n");

        //Oppgave 3c
        System.out.println("Oppgave 3c");

        int gjSnittsLonnKvinner = (Integer) people.stream()
                .filter(p->p.getKjonn().equals("Kvinne"))
                .mapToInt(p -> p.getAarslonn()).sum() / antallKvinner;
                System.out.println("Gjennomsnittslonn for kvinner: " + gjSnittsLonnKvinner + "\n");

        //Oppgave 3d
        System.out.println("Oppgave 3d");

        List<Ansatt> sjefLonn = people.stream()
                .filter(p-> p.getStilling().matches("/Sjef/"))
                .collect(Collectors.toList());
                for(Ansatt s : sjefLonn)
                    s.setAarslonn((int) ((int) (s.getAarslonn()) * 1.07));
                System.out.println("Ny lonn til alle Sjefer som okte med 7%: " + "\n");
                for (Ansatt s : people)
                    System.out.println(s.toString()+ "\n");


        //Oppgave 3e
        System.out.println("Oppgave 3e");

        boolean tjenerMye = people.stream()
                .filter(p -> p.getAarslonn() > 800000).count() > 0;

        System.out.println("Er det noen som tjener mer en 800.000 kr: " + tjenerMye + "\n");


        //Oppgave 3f
        System.out.println("Oppgave 3f");

        people.stream()
        .forEach(System.out::println);
        System.out.println();

        //Oppgave 3g
        System.out.println("Oppgave 3g ");

        int lavestLonn = people.stream()
                .mapToInt(Ansatt::getAarslonn).min().getAsInt();
        List<Ansatt> minsteLonn = people.stream()
                .filter(p->p.getAarslonn() == lavestLonn).collect(Collectors.toList());
        System.out.println("Ansatt/Ansatte med minst lønn: " + minsteLonn + "\n");

        //Oppgave 3h
        System.out.println("Oppgave 3h");

        int sum = IntStream.range(1,1000).filter(p -> p % 3 == 0|| p % 5 == 0).sum();
        System.out.println(" Summen av alle heltall i [1, 1000> som er delelig med 3 eller 5.: " + sum);




        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  }
}
