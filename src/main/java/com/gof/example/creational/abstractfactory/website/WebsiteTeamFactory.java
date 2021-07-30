package com.gof.example.creational.abstractfactory.website;

import com.gof.example.creational.abstractfactory.Developer;
import com.gof.example.creational.abstractfactory.Manager;
import com.gof.example.creational.abstractfactory.ProjectTeamFactory;
import com.gof.example.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new WebsitePM();
    }
}
