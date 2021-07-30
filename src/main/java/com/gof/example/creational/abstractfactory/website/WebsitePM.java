package com.gof.example.creational.abstractfactory.website;

import com.gof.example.creational.abstractfactory.Manager;

public class WebsitePM implements Manager {
    @Override
    public void manageCode() {
        System.out.println("WebsitePM manages website project");
    }
}
