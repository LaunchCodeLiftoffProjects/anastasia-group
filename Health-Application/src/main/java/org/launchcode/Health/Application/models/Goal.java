package org.launchcode.Health.Application.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Goal {
    private int id;
    private static int nextId = 1;

    @NotBlank
    @Size(min =3, max=50)
    private String name;

    @Size(max = 500)
    private String description;



    public Goal(String name, String description) {
        this.name = name;
        this.description = description;
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goal goal = (Goal) o;
        return id == goal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
