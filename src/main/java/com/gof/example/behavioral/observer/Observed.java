package com.gof.example.behavioral.observer;

public interface Observed {
    public void addObserver(Observer observer);
    public void removerObserver(Observer observer);
    public void notifyObservers();
}
