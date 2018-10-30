package Bridge;

public class BankSystem extends Program {

    protected BankSystem(Developer developer){
        super(developer);
    }
    @Override
    public void developProgram() {
        System.out.println("Bank System development is in process");
        developer.writeCode();
    }
}