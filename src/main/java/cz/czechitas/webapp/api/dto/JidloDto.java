package cz.czechitas.webapp.api.dto;

import java.util.*;

public class JidloDto {

    private Long id;
    private String cas;
    private String datum;
    private String nazev;

    private List<IngredienceDto> ingredience;

    public JidloDto(Long id, String cas, String datum, String nazev, List<IngredienceDto> ingredience) {
        this.id = id;
        this.cas = cas;
        this.datum = datum;
        this.nazev = nazev;
        this.ingredience = ingredience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long newValue) {
        id = newValue;
    }

    public String getCas() {
        return cas;
    }

    public void setCas(String newValue) {
        cas = newValue;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String newValue) {
        datum = newValue;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String newValue) {
        nazev = newValue;
    }

    public List<IngredienceDto> getIngredience() {
        return ingredience;
    }

    public void setIngredience(List<IngredienceDto> newValue) {
        ingredience = newValue;
    }
}
