package Oppgave1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OppgaveA {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("10", "1", "20", "110", "21", "12");

        Collections.sort(list, (o1, o2) -> Integer.valueOf(o1).compareTo(Integer.valueOf(o2)));
        System.out.println(list);

    }
}
