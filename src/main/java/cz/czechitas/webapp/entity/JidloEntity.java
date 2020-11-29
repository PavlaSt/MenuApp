package cz.czechitas.webapp.entity;

import java.time.*;

public class JidloEntity {

    private Long id;
    private LocalTime cas;
    private LocalDate datum;
    private String nazev;

    public JidloEntity() {
    }

    public JidloEntity(Long id, LocalTime cas, LocalDate datum, String nazev) {
        this.id = id;
        this.cas = cas;
        this.datum = datum;
        this.nazev = nazev;
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
}
