package org.example;

public class Sun implements Universe {

    public Sun() {
    }


    @Override
    public void getSpaceName() {
        System.out.println("sun");
    }

    @Override
    public String toString() {
        return "Sun{}";
    }
}