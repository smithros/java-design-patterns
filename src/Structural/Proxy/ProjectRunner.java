package Structural.Proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/SMiThRos/java-design-patterns");

        project.run();
    }
}
