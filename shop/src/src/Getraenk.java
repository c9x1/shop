package src;

public class Getraenk implements Artikel, Comparable<Getraenk> {
    private String name;
    private double preis;
    private LinkedList<Zutat> zutaten;

    public Getraenk(String name, double preis) {

        this.name = name;
        this.preis = preis;
        this.zutaten = new LinkedList<Zutat>();
    }

    // Implement comparable
    @Override
    public int compareTo(Getraenk o) {
        return Double.compare(this.preis, o.preis);
    }

    // Implementiert Artikel
    @Override
    public double getPreis() {
        return preis;
    }
    @Override
    public String getName() {
        return name;
    }

    public void addZutat(Zutat zutat) {
        this.zutaten.addElement(zutat);
    }
}