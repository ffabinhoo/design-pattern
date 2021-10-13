package com.fabio.designpattern.adapter;

public class Main {
    public static void main(String[] args) {
        CarPriceCalculator car = new CarPriceCalculator("Ford", 3, 10000);
        TruckPriceCalculator truck = new TruckPriceCalculator( 3, 10000);

        UKPriceCalculator ukCar = new UKPriceCalculator("Subaru", 3);
        //Cannot printVehiclePrice as it is not implementing Price calculator so have to create an Adapter

        AdapterUK adapterUK = new AdapterUK(ukCar);

        printVehiclePrice(car);
        printVehiclePrice(truck);
        printVehiclePrice(adapterUK);


    }

    public static void  printVehiclePrice(PriceCalculator calculator){
        String price = calculator.calculatePrice();
        System.out.println("The price is: " + price);

    }
}
