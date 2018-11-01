package Creational.Factory;

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the programming language, that you need: ");
        String input = scanner.nextLine();
        DeveloperFactory developerFactory = createDeveloperBySpecialty(input);
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }
    private static DeveloperFactory createDeveloperBySpecialty(String specialty){
        if (specialty.equalsIgnoreCase("Java")){
            return  new JavaDeveloperFactory();
        }else if(specialty.equalsIgnoreCase("C++")){
            return new CppDeveloperFactory();
        }else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
}
