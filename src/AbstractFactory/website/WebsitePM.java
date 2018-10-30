package AbstractFactory.website;

import AbstractFactory.Manager;

public class WebsitePM implements Manager {
    @Override
    public void manageCode() {
        System.out.println("WebsitePM manages website project");
    }
}
