package fr.imie.groupe3.project.dto;

/**
 * Generic tuple
 *
 * Created by le1cool on 10/05/16.
 */
public class TupleNameValue {
    private String name;
    private String value;

    public TupleNameValue(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public TupleNameValue(String name, Object value) {
        this.name = name;
        this.value = (value != null)?value.toString():"";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
