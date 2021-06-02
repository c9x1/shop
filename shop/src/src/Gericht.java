package src;

public class Gericht implements Artikel, Comparable<Gericht> {
    private int id;
    private String name;
    private double preis;
    private LinkedList<Zutat> zutaten;
    private Kategorie kategorie;

    public Gericht(int id, String name, double preis, Kategorie kategorie){

        this.id = id;
        this.name = name;
        this.preis = preis;
        this.kategorie = kategorie;
        this.zutaten = new LinkedList<Zutat>();
    }

    // Implementiert Comparable
    @Override
    public int compareTo(Gericht other) {
        return Double.compare(this.preis, other.preis);
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

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }
    public Kategorie getKategorie() {
        return kategorie;
    }

    public LinkedList<Zutat> getZutaten() {
        return zutaten;
    }
}

