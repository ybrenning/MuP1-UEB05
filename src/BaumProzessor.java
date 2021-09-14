import java.text.DecimalFormat;

public class BaumProzessor {
    private Knoten wurzelDesBaumes;
    private Operator operator;

    public BaumProzessor(Knoten wurzelDesBaumes, Operator operator) {
        this.wurzelDesBaumes = wurzelDesBaumes;
        this.operator = operator;
    }

    public void berechneErgebnis() {
        verarbeiteKnoten(wurzelDesBaumes);
        System.out.println("Operator: " + operator.getBezeichnung());
        System.out.println("Ergebnis: " + String.format("%.2f", operator.liefereErgebnis()));
    }

    private void verarbeiteKnoten(Knoten knoten) {
        operator.verarbeiteWert(knoten.getWert());

        for (Knoten kind : knoten.getKinder()) {
            verarbeiteKnoten(kind);
        }
    }
}
