package com.fabio.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class DeliveryData implements Subject{
    private List<Observer> observers;
    private String location;

    public DeliveryData() {
        this.observers = new ArrayList<>();
        this.location = "Location init";
    }

    @Override
    public void register(Observer obj) {
        this.observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        this.observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach(obj -> obj.update(location));
    }

    public void getCurrentLocation(){
        observers.stream().forEach(obj -> System.out.println(obj.getClass().getTypeName() + " Current location:" + location));
    }

    public void locationChanged(String new_location){
        this.location = new_location;
        notifyObservers();
    }

}
