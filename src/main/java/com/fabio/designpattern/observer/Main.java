package com.fabio.designpattern.observer;

public class Main {

    public static void main(String[] args) {
        DeliveryData topic = new DeliveryData();

        Observer seller = new Seller();
        Observer user = new User();
        Observer deliveryCenter = new DeliveryCenter();

        topic.register(seller);
        topic.register(user);

        topic.getCurrentLocation();

        System.out.println("###########");

        topic.register(deliveryCenter);
        topic.unregister(user);
        topic.locationChanged("new location");
    }
}
