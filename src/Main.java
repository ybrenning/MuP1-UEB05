import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Knoten kind5 = new Knoten(9.2);
        Knoten kind4 = new Knoten(5.3);
        Knoten kind3 = new Knoten(1.0);
        Knoten kind2 = new Knoten(3.1, Arrays.asList(kind3, kind4));
        Knoten kind1 = new Knoten(4.4, Arrays.asList(kind5));
        Knoten wurzel = new Knoten(7.0, Arrays.asList(kind1, kind2));


        Summe summe = new Summe();
        Durchschnitt durchschnitt = new Durchschnitt();
        BaumProzessor bp1 = new BaumProzessor(wurzel, summe);
        BaumProzessor bp2 = new BaumProzessor(wurzel, durchschnitt);

        bp1.berechneErgebnis();
        bp2.berechneErgebnis();
    }
}
