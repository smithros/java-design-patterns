package com.gof.example.creational.abstractfactory.banking;

import com.gof.example.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
