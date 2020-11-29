package cz.czechitas.webapp.entity;

public class IngredienceEntity {

    private String jednotka;
    private String nazev;

    public IngredienceEntity(String jednotka, String nazev) {
        this.jednotka = jednotka;
        this.nazev = nazev;
    }

    public String getJednotka() {
        return jednotka;
    }

    public void setJednotka(String newValue) {
        jednotka = newValue;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String newValue) {
        nazev = newValue;
    }
}
