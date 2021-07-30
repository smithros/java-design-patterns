package com.gof.example.creational.abstractfactory.website;

import com.gof.example.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
