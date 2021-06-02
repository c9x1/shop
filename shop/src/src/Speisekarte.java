package src;

import java.util.Iterator;

public class Speisekarte {
    private Baum<Gericht> gerichte;
    private Baum<Getraenk> getraenke;

    static Gericht LachsMaki;
    static Gericht AvocadoMaki;
    static Gericht GurkeMaki;
    static Gericht ThunfischMaki;
    static Gericht LachsNigiri;
    static Gericht ShrimpNigiri;
    static Gericht CaliforniaRoll;
    static Gericht AlaskaRoll;
    static Gericht MisoSuppe;
    static Gericht WanTanSuppe;
    static Getraenk cola;
    static Getraenk spriteLim;
    static Getraenk fanta;
    static Getraenk bier;
    static Getraenk sake;
    static Getraenk oSaft;
    static Getraenk traubenSaft;


    public Speisekarte() {
        this.gerichte = new Baum<Gericht>();
        this.getraenke = new Baum<Getraenk>();

        // alle verfügbaren gerichte:
        LachsMaki = new Gericht(1, "Maki mit Lachs", 0.80,Kategorie.MAKI);
        LachsMaki.addZutat(new Zutat("Reis",85,Einheit.GR));
        LachsMaki.addZutat(new Zutat("Nori-Blatt",1, Einheit.ST));
        LachsMaki.addZutat(new Zutat("Lachs",75, Einheit.GR));

        AvocadoMaki = new Gericht(2, "Maki mit Avocado", 1.00,Kategorie.MAKI);
        AvocadoMaki.addZutat(new Zutat("Reis",85,Einheit.GR));
        AvocadoMaki.addZutat(new Zutat("Nori-Blatt",1, Einheit.ST));
        AvocadoMaki.addZutat(new Zutat("Avocado",50, Einheit.GR));

        GurkeMaki = new Gericht(3, "Maki mit Gurke", 0.60,Kategorie.MAKI);
        GurkeMaki.addZutat(new Zutat("Reis",85,Einheit.GR));
        GurkeMaki.addZutat(new Zutat("Nori-Blatt",1, Einheit.ST));
        GurkeMaki.addZutat(new Zutat("Gurke",40, Einheit.GR));

        ThunfischMaki = new Gericht(4, "Maki mit Thunfisch", 0.70,Kategorie.MAKI);
        ThunfischMaki.addZutat(new Zutat("Reis",85,Einheit.GR));
        ThunfischMaki.addZutat(new Zutat("Nori-Blatt",1, Einheit.ST));
        ThunfischMaki.addZutat(new Zutat("Thunfisch",70, Einheit.GR));

        LachsNigiri = new Gericht(5, "Nigiri mit Lachs", 1.20,Kategorie.NIGIRI);
        LachsNigiri.addZutat(new Zutat("Reis",85,Einheit.GR));
        LachsNigiri.addZutat(new Zutat("Lachs",75, Einheit.GR));

        ShrimpNigiri =  new Gericht(6, "Nigiri mit Shrimp", 1.10,Kategorie.NIGIRI);
        ShrimpNigiri.addZutat(new Zutat("Reis",85,Einheit.GR));
        ShrimpNigiri.addZutat(new Zutat("Shrimp",90, Einheit.GR));

        CaliforniaRoll = new Gericht(7, "California Roll", 1.80,Kategorie.ROLLS);
        CaliforniaRoll.addZutat(new Zutat("Krabbenfleisch",35, Einheit.GR));
        CaliforniaRoll.addZutat(new Zutat("Lachs",75, Einheit.GR));
        CaliforniaRoll.addZutat(new Zutat("Reis",85,Einheit.GR));
        CaliforniaRoll.addZutat(new Zutat("Nori-Blatt",1, Einheit.ST));

        AlaskaRoll = new Gericht(8, "Alaska Roll", 1.70,Kategorie.ROLLS);
        AlaskaRoll.addZutat(new Zutat("Gurke",40, Einheit.GR));
        AlaskaRoll.addZutat(new Zutat("Lachs",75, Einheit.GR));
        AlaskaRoll.addZutat(new Zutat("Reis",85,Einheit.GR));
        AlaskaRoll.addZutat(new Zutat("Nori-Blatt",1, Einheit.ST));

        MisoSuppe = new Gericht(9, "Miso Wan", 3.20,Kategorie.SUPPEN);
        MisoSuppe.addZutat(new Zutat("Wasser",300, Einheit.ML));
        MisoSuppe.addZutat(new Zutat("Salz",1, Einheit.PRISE));
        MisoSuppe.addZutat(new Zutat("Gewürzpaste",0.75, Einheit.EL));
        MisoSuppe.addZutat(new Zutat("Tofu",50, Einheit.GR));

        WanTanSuppe = new Gericht(10, "Wan Tan", 3.10,Kategorie.SUPPEN);
        WanTanSuppe.addZutat(new Zutat("Wasser",300, Einheit.ML));
        WanTanSuppe.addZutat(new Zutat("Hähnchenbrust",100, Einheit.GR));
        WanTanSuppe.addZutat(new Zutat("Koriander",0.25, Einheit.PRISE));
        WanTanSuppe.addZutat(new Zutat("Karotte",0.5, Einheit.ST));
        WanTanSuppe.addZutat(new Zutat("Zitronengras",0.5, Einheit.ST));


        //alle getraenke
        cola = new Getraenk("Coca Cola", 3.5);
        cola.addZutat(new Zutat("Wasser",400, Einheit.ML));
        cola.addZutat(new Zutat("Farbstoff",60, Einheit.ML));
        cola.addZutat(new Zutat("Koffein",40, Einheit.ML));

        spriteLim = new Getraenk("Sprite", 3.5);
        spriteLim.addZutat(new Zutat("Wasser",400, Einheit.ML));
        spriteLim.addZutat(new Zutat("Zitrone",90, Einheit.ML));
        spriteLim.addZutat(new Zutat("Koffein",40, Einheit.ML));

        fanta = new Getraenk("Fanta", 3.5);
        fanta.addZutat(new Zutat("Wasser",400, Einheit.ML));
        fanta.addZutat(new Zutat("Farbstoff",40, Einheit.ML));
        fanta.addZutat(new Zutat("Koffein",60, Einheit.ML));

        bier = new Getraenk("Bier", 4.6);
        bier.addZutat(new Zutat("Hopfen",300, Einheit.ML));
        bier.addZutat(new Zutat("Hefe",100, Einheit.ML));
        bier.addZutat(new Zutat("Alkohol", 100, Einheit.ML));

        sake = new Getraenk("Sake", 10.9);
        sake.addZutat(new Zutat("Wasser",400, Einheit.ML));
        sake.addZutat(new Zutat("Alkohol",60, Einheit.ML));
        sake.addZutat(new Zutat("Reis",40, Einheit.ML));

        oSaft = new Getraenk("Orangensaft",3.2);
        oSaft.addZutat(new Zutat("gepresste Orangensaft", 100, Einheit.ML));
        oSaft.addZutat(new Zutat("Wasser", 110, Einheit.ML));
        oSaft.addZutat(new Zutat("Zucker", 40, Einheit.ML));

        traubenSaft = new Getraenk("Traubensaft", 3.2);
        traubenSaft.addZutat(new Zutat("Wasser",380, Einheit.ML));
        traubenSaft.addZutat(new Zutat("gepresste Traubensaft",60, Einheit.ML));
        traubenSaft.addZutat(new Zutat("Zucker",60, Einheit.ML));

        this.gerichte.addElement(LachsMaki);//... .sort als soritierung in Liste
        this.gerichte.addElement(AvocadoMaki);
        this.gerichte.addElement(GurkeMaki);
        this.gerichte.addElement(ThunfischMaki);
        this.gerichte.addElement(LachsNigiri);
        this.gerichte.addElement(ShrimpNigiri);
        this.gerichte.addElement(CaliforniaRoll);
        this.gerichte.addElement(AlaskaRoll);
        this.gerichte.addElement(MisoSuppe);
        this.gerichte.addElement(WanTanSuppe);

        this.getraenke.addElement(cola);
        this.getraenke.addElement(spriteLim);
        this.getraenke.addElement(fanta);
        this.getraenke.addElement(bier);
        this.getraenke.addElement(sake);
        this.getraenke.addElement(oSaft);
        this.getraenke.addElement(traubenSaft);
    }

    public Baum<Gericht> getGerichte() {
        return this.gerichte;
    }

    public double berechnePreis() {
        double preis = 0.0;

        Iterator<Gericht> it = gerichte.iterator();
        while (it.hasNext()) {
            preis += it.next().getPreis();
        }

        return preis;
    }
}
