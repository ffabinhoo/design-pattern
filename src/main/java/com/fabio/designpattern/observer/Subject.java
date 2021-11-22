package com.fabio.designpattern.observer;

public interface Subject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();

}
