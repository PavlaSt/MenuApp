package cz.czechitas.webapp.entity;

public class JidloEntity {

    private Long id;
    private String cas;
    private String datum;
    private String nazev;



    public JidloEntity(Long id, String cas, String datum, String nazev) {
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
}
