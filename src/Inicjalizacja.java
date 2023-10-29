import java.util.*;

public class Inicjalizacja {
    private static void printCollection(ArrayList<Osoba> list) { //Metoda służąca do wyświetlania
        for (Osoba element : list) {                             //zawartości zbioru osób na konsoli.
            System.out.println(element.toString());
        }
    }
    public static void run(){
        ArrayList<Osoba> list = new ArrayList<>();
        list.add(new Osoba("Marta", 23));
        list.add(new Osoba("Igor", 8));
        list.add(new Osoba("Elena", 2));
        list.add(new Osoba("Kris", 45));
        list.add(new Osoba("Natalia", 100));

        SortByWiek comparator = new SortByWiek();

        Collections.sort(list, comparator);

        printCollection(list);


    }
}
