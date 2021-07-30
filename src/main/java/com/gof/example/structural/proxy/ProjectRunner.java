package com.gof.example.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://example.com");

        project.run();
    }
}
