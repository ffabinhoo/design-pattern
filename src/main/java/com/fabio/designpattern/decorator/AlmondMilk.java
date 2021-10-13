package com.fabio.designpattern.decorator;

public class AlmondMilk extends CondimentDecorator{
    Beverage beverage;

    public AlmondMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Almond Milk";
    }
}
