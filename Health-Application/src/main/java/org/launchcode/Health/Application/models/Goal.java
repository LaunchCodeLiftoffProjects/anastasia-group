package org.launchcode.Health.Application.models;

import java.util.List;
import java.util.Objects;

public class Goal {
    private int id;
    private static int nextId = 1;
    private String name;
    private String description;
    private WeekDays days;





    public Goal(String name, String description, WeekDays days ) {
        this.name = name;
        this.description = description;
        this.id = nextId;
        nextId++;
        this.days = days;
    }

    public  Goal(){
       this.id = nextId;
       nextId++;
    }


    public WeekDays getDays() {
        return days;
    }

    public void setDays(WeekDays days) {
        this.days = days;
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
