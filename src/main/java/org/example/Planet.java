package org.example;

import java.util.List;

public class Planet {
    private List<Universe> universe;
    private String name;

    public Planet(List<Universe> universe, String name) {
        this.universe = universe;
        this.name = name;
    }

    public Planet() {
    }

    public List<Universe> getUniverse() {
        return universe;
    }

    public void setUniverse(List<Universe> universe) {
        this.universe = universe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "universe=" + universe +
                ", name='" + name + '\'' +
                '}';
    }
}