package Structural.Decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDev(new JavaDev()));

        System.out.println(developer.makeJob());
    }
}
