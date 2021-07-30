package com.gof.example.creational.abstractfactory.banking;

import com.gof.example.creational.abstractfactory.Manager;

public class BankingPM implements Manager {
    @Override
    public void manageCode() {
        System.out.println("Manages manages code");
    }
}
