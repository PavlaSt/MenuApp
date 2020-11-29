package cz.czechitas.webapp.entity;

public class JidloIngredienceEntity {

    private Long idJidlo;
    private Long idIngredience;
    private Integer mnozstvi;

    public JidloIngredienceEntity(Long idJidlo, Long idIngredience, Integer mnozstvi) {
        this.idJidlo = idJidlo;
        this.idIngredience = idIngredience;
        this.mnozstvi = mnozstvi;
    }

    public Long getIdJidlo() {
        return idJidlo;
    }

    public void setIdJidlo(Long newValue) {
        idJidlo = newValue;
    }

    public Long getIdIngredience() {
        return idIngredience;
    }

    public void setIdIngredience(Long newValue) {
        idIngredience = newValue;
    }

    public Integer getMnozstvi() {
        return mnozstvi;
    }

    public void setMnozstvi(Integer newValue) {
        mnozstvi = newValue;
    }
}
