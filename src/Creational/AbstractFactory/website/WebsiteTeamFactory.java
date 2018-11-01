package Creational.AbstractFactory.website;

import Creational.AbstractFactory.Developer;
import Creational.AbstractFactory.Manager;
import Creational.AbstractFactory.ProjectTeamFactory;
import Creational.AbstractFactory.Tester;

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
