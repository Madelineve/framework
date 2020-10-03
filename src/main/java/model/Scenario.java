package model;

import javax.persistence.*;

@Entity
@Table(name = "scenario")
public class Scenario implements java.io.Serializable{

    @GeneratedValue
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    @Lob
    private String description;

    public Scenario() {
        this.name="Test";
        this.description="Test do wykonania";
    }

    //nadpisana metoda toString
    @Override
    public String toString() {
        return "Encja Scenario{ id=" + id + ", " + name + ", " + description + "}";
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }
}
