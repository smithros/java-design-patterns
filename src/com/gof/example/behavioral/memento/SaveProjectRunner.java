package com.gof.example.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("Creating new project, Version 1.0");
        project.setVersionAndDate("Version 1.0");
        System.out.println(project);

        System.out.println("Saving current version to github");
        githubRepo.setSave(project.save());

        System.out.println("Updating project to version 1.1");

        System.out.println("Writing code....");
        Thread.sleep(5000);
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);

        System.out.println("Something went wrong");
        project.load(githubRepo.getSave());
        System.out.println("Project aftet rollback");
        System.out.println(project);
    }
}
