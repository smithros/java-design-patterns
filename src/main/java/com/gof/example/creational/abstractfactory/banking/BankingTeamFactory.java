package com.gof.example.creational.abstractfactory.banking;

import com.gof.example.creational.abstractfactory.Developer;
import com.gof.example.creational.abstractfactory.Manager;
import com.gof.example.creational.abstractfactory.ProjectTeamFactory;
import com.gof.example.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getManager() {
        return new BankingPM();
    }
}
