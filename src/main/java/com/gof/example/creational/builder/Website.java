package com.gof.example.creational.builder;

public class Website {
    private String name;
    private String cms;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCms(String cms) {
        this.cms = cms;
    }

    @Override
    public String toString() {
        return "Website{" +
            "price=" + price +
            " cms=" + cms +
            " name=" + name + '\'' +
            "}";
    }
}
