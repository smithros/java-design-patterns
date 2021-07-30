package com.gof.example.behavioral.visitor;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project(){
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test(),
        };
    }

    @Override
    public void beWritted(Developer developer) {
        for(ProjectElement element: projectElements){
            element.beWritted(developer);
        }
    }
}
