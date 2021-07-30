package com.gof.example.structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJavaDev = new JavaDeveloper();
        Developer secondJavaDev = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDev);
        team.addDeveloper(secondJavaDev);
        team.addDeveloper(cppDeveloper);

        team.createProject();
    }
}
