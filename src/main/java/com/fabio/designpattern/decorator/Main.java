package com.fabio.designpattern.decorator;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Milk(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Cappucino();
        beverage2 = new Chocolate(beverage2);
        beverage2 = new Milk(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new Cappucino();
        beverage3 = new Chocolate(beverage3);
        beverage3 = new AlmondMilk(beverage3);

        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
