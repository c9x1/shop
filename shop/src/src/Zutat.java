package src;

public class Zutat {

    private String name;
    private double menge;
    private Einheit einheit;
    // evtl Preis, wenn jede Zutat ihren Preis an das Gericht übergibt, welches dann den Gesamtpreis berechnet

    public Zutat (String name, double menge, Einheit einheit){
        this.name = name;
        this.menge = menge;
        this.einheit = einheit;
    }

    public String getName() {
        return name;
    }

    public double getMenge() {
        return menge;
    }
}
