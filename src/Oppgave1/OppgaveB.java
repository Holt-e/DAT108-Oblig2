package Oppgave1;

import java.util.function.BiFunction;

public class OppgaveB {

    public static void main(String[] args){

        BiFunction<Integer, Integer, Integer> add = (a, b)-> a + b;
        BiFunction<Integer,Integer,Integer> biggest = (a, b)-> a > b ? a : b;
        int sum = beregn(12, 13, summerFunksjon);
    }

    public static int beregn(int a, int b, summerFunksjon s){

      return s.sum(a,b);
    }

}
