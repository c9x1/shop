package src;

public class Kunde {

    private String name;
    final double budget;
    private Warenkorb warenkorb;

    public Kunde(String name, double budget, Warenkorb warenkorb){
        this.name = name;
        this.budget = budget;
        this.warenkorb = warenkorb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public Warenkorb getWarenkorb() {
        return warenkorb;
    }

    public void setWarenkorb(Warenkorb warenkorb) {
        this.warenkorb = warenkorb;
    }


    public void produkthinzufuegen(Getraenk ge) { warenkorb.AddGetraenk(ge);}
}
