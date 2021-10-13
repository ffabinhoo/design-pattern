package com.fabio.designpattern.decorator;

public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .90;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
