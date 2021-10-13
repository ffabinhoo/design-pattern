package com.fabio.designpattern.decorator;

public abstract class Beverage {
    String description = "Unknow beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
