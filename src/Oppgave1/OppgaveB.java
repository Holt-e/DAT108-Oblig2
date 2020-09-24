package Oppgave1;

import java.util.function.BiFunction;

public class OppgaveB {

    public static void main(String[] args){

        BiFunction<Integer, Integer, Integer> summerFunksjon = (a, b)-> a + b;
        int sum = beregn(12, 13, summerFunksjon);
        System.out.println("Summen av 12 og 13 = " + sum);

        BiFunction<Integer,Integer,Integer> stoersteVerdiFunksjon = (a, b)-> a > b ? a : b;
        int stoersteVerdi = beregn(-5, 3, stoersteVerdiFunksjon);
        System.out.println("Den største av -5 og 3 = " + stoersteVerdi);

        BiFunction<Integer, Integer,Integer> avstandFunksjon = (a,b)-> a >= b ? a - b : b - a;
        int avstand = beregn(54,45,avstandFunksjon);
        System.out.println("Avstanden (absoluttverdien av differansen) mellom 54 og 45 = " + avstand);
    }

    public static int beregn(int a, int b, BiFunction<Integer,Integer,Integer> foo){

      return foo.apply(a,b);
    }

}
