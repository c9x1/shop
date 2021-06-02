package src;

public enum Einheit {
    ML("Milliliter"),
    GR("Gramm"),
    TL("Teelöffel"),
    EL("Esslöffel"),
    PRISE("Prise"),
    ST ("Stück");

    private String einheit;

    Einheit (String einheit) {
        this.einheit = einheit;
    }
}