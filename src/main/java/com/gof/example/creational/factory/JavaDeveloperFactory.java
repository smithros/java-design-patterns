package com.gof.example.creational.factory;

class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper(){
        return new JavaDeveloper();
    }
}
