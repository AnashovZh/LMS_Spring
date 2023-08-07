package org.example;

public class Java {
    private  String name;

    public Java(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Java{" +
                "name='" + name + '\'' +
                '}';
    }
}
