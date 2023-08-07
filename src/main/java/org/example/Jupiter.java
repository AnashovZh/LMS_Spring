package org.example;

public class Jupiter implements Universe {
    @Override
    public String toString() {
        return "Jupiter{}";
    }

    @Override
    public void getSpaceName() {
        System.out.println("jupiter ");
    }
}
