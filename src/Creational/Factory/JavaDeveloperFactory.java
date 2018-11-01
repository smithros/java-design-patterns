package Creational.Factory;

class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper(){
        return new JavaDeveloper();
    }
}
