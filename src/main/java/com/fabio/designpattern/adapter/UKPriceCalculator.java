package com.fabio.designpattern.adapter;

public class UKPriceCalculator {
    private int age;
    private String model;
    private static int averagePrice = 20000;

    public UKPriceCalculator(String model, int age) {
        this.age = age;
        this.model = model;
    }

    public int getPrice(){
        return Math.max(averagePrice - age * 100, 0);
    }
}
