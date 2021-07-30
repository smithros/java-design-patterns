package com.gof.example.behavioral.iterator;

public class DeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring","Hibernate","Maven","MySQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Vasya Pupkin", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
