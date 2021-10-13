package com.fabio.designpattern.decorator;

public class Chocolate extends CondimentDecorator{
    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }
}
