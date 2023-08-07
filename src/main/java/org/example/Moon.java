package org.example;

public class Moon implements Universe{

    @Override
    public String toString() {
        return "Moon{}";
    }

    @Override
    public void getSpaceName() {
        System.out.println("moon");
    }
}
