package ProbabilityLab2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Generate {
    private double sigma;
    private double m;

    // R'
    double getRandomSum(){
        final int n1 = 65;
        float S = 0;
        double[] array = new double[12];
        double sum = 0;

        for(int i=0; i < array.length; i++){
            array[i] = Math.random();
            sum += array[i];
        }
        int ms = n1/2;
        sum = sum - 6.0;
        return sum;
    }

    void sigmaInput() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inputted value of sigma: ");
        scanner.useLocale(Locale.US);
        try {
            sigma = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input, because of locale");
        }

    }
    void mathematicalWaitingInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inputted value of m: ");
        scanner.useLocale(Locale.US);
        try {
            m = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input, because of locale");
        }
    }
    // R
    double getTheoreticalRValue(double sum){
        return sigma*sum+m;
    }
}