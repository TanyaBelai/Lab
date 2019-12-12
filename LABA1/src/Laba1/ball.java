package Laba1;

import java.lang.*;
public class ball {
    private double weight;
    private String color;

    private ball() {
        weight = 1.2;
        color = "white";
    }
    public ball(double w) {
        weight = w;
        color = "white";
    }
    public ball (double w, String c) {
        weight = w;
        color = c;
    }

    public double getWeight() {
        return weight;
    }
    public String getColor() {
        return color;
    }
}
