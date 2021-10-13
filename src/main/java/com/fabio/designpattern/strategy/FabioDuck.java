package com.fabio.designpattern.strategy;

public class FabioDuck extends Duck{

    public FabioDuck() {
        setQuackBehavior(new DontLikeQuack());
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a Fabio duck");
    }

}
