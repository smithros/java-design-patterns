package com.gof.example.behavioral.visitor;

public class Database implements ProjectElement {
    @Override
    public void beWritted(Developer developer) {
        developer.create(this);
    }
}
