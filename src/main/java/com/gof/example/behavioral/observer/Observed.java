package com.gof.example.behavioral.observer;

public interface Observed {
    void addObserver(Observer observer);

    void removerObserver(Observer observer);

    void notifyObservers();
}
