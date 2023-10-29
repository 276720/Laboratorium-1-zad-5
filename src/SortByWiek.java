import java.util.Comparator;

public class SortByWiek implements Comparator<Osoba> {
    @Override
    public int compare(Osoba osoba1, Osoba osoba2) { // Metoda sortuję objekty typu Osoba na podstawie wieku
        return osoba1.getWiek()- osoba2.getWiek();
    }
}