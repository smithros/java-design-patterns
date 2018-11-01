package Creational.AbstractFactory.banking;

import Creational.AbstractFactory.Manager;

public class BankingPM implements Manager {
    @Override
    public void manageCode() {
        System.out.println("Manages manages code");
    }
}
