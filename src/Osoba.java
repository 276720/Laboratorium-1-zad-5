import java.util.Comparator;

public class Osoba{
    private String imie;
    private int wiek;

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public Osoba(String imie, int wiek) { // Konstruktor z parametrami
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() { ///Przesłonięta metoda, która zwraca reprezentację obiektu Osoba w postaci ciągu znaków.
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}


