package cz.czechitas.webapp.api.dto;

public class IngredienceDto {

    private String nazev;
    private String jednotka;
    private Integer mnozstvi;

    public IngredienceDto(String nazev, String jednotka, Integer mnozstvi) {
        this.nazev = nazev;
        this.jednotka = jednotka;
        this.mnozstvi = mnozstvi;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String newValue) {
        nazev = newValue;
    }

    public String getJednotka() {
        return jednotka;
    }

    public void setJednotka(String newValue) {
        jednotka = newValue;
    }

    public Integer getMnozstvi() {
        return mnozstvi;
    }

    public void setMnozstvi(Integer newValue) {
        mnozstvi = newValue;
    }
}
