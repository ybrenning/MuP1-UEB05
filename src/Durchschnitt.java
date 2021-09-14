public class Durchschnitt implements Operator {
    private int anzahlSummanden;
    private double summe;

    public Durchschnitt() {
        anzahlSummanden = 0;
        summe = 0.0;
    }

    @Override
    public void verarbeiteWert(double wert) {
        summe += wert;
        anzahlSummanden++;
    }

    @Override
    public double liefereErgebnis() {
        if (anzahlSummanden == 0) return 0;
        return (summe / (double) anzahlSummanden);
    }

    @Override
    public String getBezeichnung() {
        return "Durchschnitt";
    }
}
