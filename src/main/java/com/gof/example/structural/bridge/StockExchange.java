package com.gof.example.structural.bridge;

public class StockExchange extends Program {

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development is in process");
        developer.writeCode();
    }
}
