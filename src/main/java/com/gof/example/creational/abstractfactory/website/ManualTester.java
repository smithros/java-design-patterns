package com.gof.example.creational.abstractfactory.website;

import com.gof.example.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website");
    }
}
