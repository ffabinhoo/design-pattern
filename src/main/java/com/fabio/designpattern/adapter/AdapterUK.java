package com.fabio.designpattern.adapter;

public class AdapterUK implements PriceCalculator{
    UKPriceCalculator ukPriceCalculator;

    public AdapterUK(UKPriceCalculator ukPriceCalculator){
        this.ukPriceCalculator = ukPriceCalculator;
    }


    @Override
    public String calculatePrice() {
        return ukPriceCalculator.getPrice() + "GBP";
    }
}
