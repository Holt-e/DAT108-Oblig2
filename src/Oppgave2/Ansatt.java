package Oppgave2;

import java.util.ArrayList;
import java.util.Comparator;

public class Ansatt implements Runnable{

    public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T>

                    List<Ansatt> empList = new ArrayList<>();
	        empList.add(new Ansatt("Henrik", "Olsen", "Mann", "CEO", 1 000 000))
            empList.add(new Ansatt("Karl", "Olafsen", "Mann", "CFO", 900 000))
            empList.add(new Ansatt("Guri", "Hansen", "Kvinne", "CTO", 900 000))
            empList.add(new Ansatt("Trond", "Larsen", "Mann", "Senior Utvikler",  550 000))
            empList.add(new Ansatt("Line", "Fyllingen", "Kvinne", "Junior Utvikler ", 450 000))

    Comparator<Ansatt> comp = Comparator.comparing()

}
