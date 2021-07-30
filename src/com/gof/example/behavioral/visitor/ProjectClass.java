package com.gof.example.behavioral.visitor;

public class ProjectClass implements ProjectElement {
    @Override
    public void beWritted(Developer developer) {
        developer.create(this);
    }
}
