package com.gof.example.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");

        Observer firstSubscriber = new Subscriber("Vasya Pupkin");
        Observer secnondSubscriber = new Subscriber("Petya Vorotynsev");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secnondSubscriber);

        jobSite.addVacancy("Third Java Position");

        jobSite.removeVacancy("First Java position");
    }
}
