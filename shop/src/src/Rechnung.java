package src;

import java.util.HashMap;

public class Rechnung {
    // Menge von Gericht , wie viel
    // Ein kunde kann das selbe gericht/getränk mehr als einmal haben!!
    private HashMap<Artikel, Integer> sammlung;

    Rechnung(Warenkorb warenKorb)
    {
        sammlung = new HashMap();
    }

    void addArtikel(Artikel artikel)
    {
        // füge artikel hinzu, wenn er schon existiert, inkrementiere menge
        // natürlich fangen wir bei menge 1 an
        Integer menge = sammlung.get(artikel);
        sammlung.put(artikel, menge == null ? 1 : menge + 1);
    }

    double berechneGesamtsumme() {
        double preis = 0.0;

        for (Artikel a : sammlung.keySet())
        {
            // preis mal menge
            preis += a.getPreis() * sammlung.get(a);
        }

        return preis;
    }

    @Override
    public String toString()
    {
        boolean first = true;
        String str = "";
        for (Artikel a : sammlung.keySet())
        {
            if (first)
                first = false;
            else
                str += "\n";

            String typ = a instanceof  Getraenk ? "Getränk" : "Gericht";
            str += typ + ": " + a.getName() + ",\t Anzahl: " + sammlung.get(a) + ",\tPreis: " + a.getPreis()*sammlung.get(a) + " €";
        }

        return str;
    }
}
