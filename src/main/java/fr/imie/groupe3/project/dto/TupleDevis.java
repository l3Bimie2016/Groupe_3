package fr.imie.groupe3.project.dto;

/**
 * Created by Axel on 11/05/2016.
 */
public class TupleDevis {

    private Integer id;
    private String name;

    public TupleDevis(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
