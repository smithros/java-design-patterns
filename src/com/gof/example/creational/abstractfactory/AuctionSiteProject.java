package com.gof.example.creational.abstractfactory;

import com.gof.example.creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();
        System.out.println("Creating auction website");

        developer.writeCode();
        tester.testCode();
        manager.manageCode();
}}
