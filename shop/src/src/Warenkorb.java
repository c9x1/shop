package src;

import java.util.Iterator;

public class Warenkorb {
    private LinkedList<Gericht> gerichte;
    private LinkedList<Getraenk> getraenke;

    public Warenkorb() {
        this.gerichte = new LinkedList<Gericht>();
        this.getraenke = new LinkedList<Getraenk>();
    }

    public void AddGericht(Gericht g) {
        gerichte.addElement(g);
    }

    public void AddGetraenk(Getraenk g) {
        getraenke.addElement(g);
    }

    public Rechnung CheckoutRechnung() {
        Rechnung rechnung = new Rechnung(this);

        // akkumuliere alles zusammen in der rechnung
        // Doppelte elemente werden beim einfügen entfernt und stattdessen
        // die jewailige menge erhöht
        Iterator<Gericht> gerichtIt = gerichte.iterator();
        while (gerichtIt.hasNext()) {
            rechnung.addArtikel(gerichtIt.next());
        }

        Iterator<Getraenk> getränkIt = getraenke.iterator();
        while (getränkIt.hasNext()) {
            rechnung.addArtikel(getränkIt.next());
        }

        return rechnung;
    }


}
