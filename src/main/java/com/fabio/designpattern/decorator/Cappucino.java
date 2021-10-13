package com.fabio.designpattern.decorator;

public class Cappucino extends Beverage{

    public Cappucino() {
        description = "Cappucino";
    }

    @Override
    public double cost() {
        return 3;
    }
}
