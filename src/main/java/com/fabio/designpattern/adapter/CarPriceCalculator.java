package com.fabio.designpattern.adapter;

public class CarPriceCalculator implements PriceCalculator{
    private int age;
    private int mileage;
    private String model;
    private static int averagePrice = 5000;

    public CarPriceCalculator(String model, int age, int mileage) {
        this.model = model;
        this.age = age;
        this.mileage = mileage;
    }

    @Override
    public String calculatePrice() {
        int price = Math.max(averagePrice - age*100 - mileage/100, 0);
        return price + "USD";
    }
}
