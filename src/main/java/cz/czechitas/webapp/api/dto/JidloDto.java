package cz.czechitas.webapp.api.dto;

import java.time.*;
import java.util.*;

public class JidloDto {

    private Long id;
    private LocalTime cas;
    private LocalDate datum;
    private String nazev;

    private List<IngredienceDto> ingredience;

    public JidloDto(Long id, LocalTime cas, LocalDate datum, String nazev, List<IngredienceDto> ingredience) {
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

    public LocalTime getCas() {
        return cas;
    }

    public void setCas(LocalTime newValue) {
        cas = newValue;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate newValue) {
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
