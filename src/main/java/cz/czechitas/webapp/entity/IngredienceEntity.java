package cz.czechitas.webapp.entity;

public class IngredienceEntity {

    private Long id;
    private String jednotka;
    private String nazev;

    public IngredienceEntity() {
    }

    public IngredienceEntity(Long id, String jednotka, String nazev) {
        this.id = id;
        this.jednotka = jednotka;
        this.nazev = nazev;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long newValue) {
        id = newValue;
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
