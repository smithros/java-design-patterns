package Creational.AbstractFactory.website;

import Creational.AbstractFactory.Manager;

public class WebsitePM implements Manager {
    @Override
    public void manageCode() {
        System.out.println("WebsitePM manages website project");
    }
}
