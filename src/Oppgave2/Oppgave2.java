package Oppgave2;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static Oppgave2.Kjonn.INTETKJONN;
import static Oppgave2.Kjonn.KVINNE;
import static Oppgave2.Kjonn.MANN;


public class Oppgave2 {

    public static void main(String[] args) {

        List<Ansatt> people = Arrays.asList(
                new Ansatt("Henrik", "Olsen", MANN, "Sjef", 1000000),
                new Ansatt("Karl", "Olafsen", MANN, "IT Sjef", 900000),
                new Ansatt("Guri", "Hansen", KVINNE, "IT utvikler", 900000),
                new Ansatt("Trond", "Larsen", MANN, "Senior Utvikler", 550000),
                new Ansatt("Line", "Fyllingen", KVINNE, "Junior Utvikler ", 450000),
                new Ansatt("Bruce", "Jenner", INTETKJONN, "Junior Utvikler ", 450000)
        );

        System.out.println("Alle ansatte før lønnsoppgjør: \n");
        skrivUtAlle(people);
        System.out.println("\nAlle ansatte etter fast kronetillegg: \n");
        lonnsoppgjor(people, fastKroneTillegg(20000));
        skrivUtAlle(people);
        System.out.println("\nAlle ansatte etter fast prosenttillegg: \n");
        lonnsoppgjor(people, fastProsentTillegg(5));
        skrivUtAlle(people);
        System.out.println("\nAlle ansatte etter fast kronetillegg basert på lav lønn: \n");
        lonnsoppgjor(people, fastKroneTilleggHvisLavLonn(10000, 900000));
        skrivUtAlle(people);
        System.out.println("\nAlle ansatte etter fast prosenttillegg basert på kjønn: \n");
        lonnsoppgjor(people, fastProsentTilleggKvinne(15));
        skrivUtAlle(people);
    }

    public static BiFunction<Integer, Ansatt, Integer> fastKroneTillegg(int tillegg) {
        return (lonn, p) -> lonn + tillegg;
    }

    public static BiFunction<Integer, Ansatt, Integer> fastProsentTillegg(int tillegg) {
        return (lonn, p) -> ((lonn * (100 + tillegg)) / 100);
    }

    public static BiFunction<Integer, Ansatt, Integer> fastKroneTilleggHvisLavLonn(int tillegg, int lavlonn) {
        return (lonn, p) -> {
            return (lonn <= lavlonn) ? fastKroneTillegg(tillegg).apply(lonn, p) : lonn;
        };
    }

    private static BiFunction<Integer, Ansatt, Integer> fastProsentTilleggKvinne(int tillegg) {
        return (lonn, p) -> {
            return (p.getKjonn() == Kjonn.KVINNE) ? fastProsentTillegg(tillegg).apply(lonn, p) : lonn;
        };
    }
    private static void lonnsoppgjor(List<Ansatt> people, BiFunction<Integer, Ansatt, Integer> function) {
        people.forEach((p) -> {
            int aarslonn = p.getAarslonn();
            p.setAarslonn(function.apply(aarslonn, p));
        });
    }

        private static void skrivUtAlle(List<Ansatt> people){
            people.forEach(System.out :: println);
        }

    }

