package Behavioral.Visitor;

public class Test implements ProjectElement {
    @Override
    public void beWritted(Developer developer) {
        developer.create(this);
    }
}
