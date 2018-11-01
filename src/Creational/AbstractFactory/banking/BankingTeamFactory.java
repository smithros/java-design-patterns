package Creational.AbstractFactory.banking;

import Creational.AbstractFactory.Developer;
import Creational.AbstractFactory.Manager;
import Creational.AbstractFactory.ProjectTeamFactory;
import Creational.AbstractFactory.Tester;

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
