package src;

public class Shop {

    public static void main(String args[]) {
        var speiseKarte = new Speisekarte();

        Kunde k1 = new Kunde ("Otto", 10.00, new Warenkorb());

        //k1.produkthinzufuegen(Speisekarte.LachsMaki);
        //k1.produkthinzufuegen(Speisekarte.LachsMaki);
        k1.getWarenkorb().AddGericht(Speisekarte.LachsMaki);
        k1.getWarenkorb().AddGericht(Speisekarte.LachsMaki);

        k1.getWarenkorb().AddGetraenk(Speisekarte.cola);
        k1.getWarenkorb().AddGetraenk(Speisekarte.cola);
        k1.getWarenkorb().AddGetraenk(Speisekarte.spriteLim);

        Rechnung r1 = k1.getWarenkorb().CheckoutRechnung();
        System.out.println(r1.toString());

        // rechnung.berechnepreis - einzelpreise werden mit ausgegeben
        System.out.println("------------------------------------"); // zur besseren Übersicht
        System.out.println("Gesamtpreis: " + r1.berechneGesamtsumme() + " €");
        // TODO: zufällige zahlungsmethode wählen - erledigt
        System.out.println("Zahlungsmethode: " + Zahlungsmoeglichkeit.getRandom());


    }
}



