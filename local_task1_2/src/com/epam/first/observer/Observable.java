package com.epam.first.observer;

public interface Observable {

    void attach(Observer observer);

    void detach();

    void notifyObservers();
}
