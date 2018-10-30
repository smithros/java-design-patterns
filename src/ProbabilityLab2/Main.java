package ProbabilityLab2;

public class Main {
    public static void main(String[] args) {
        final int age = 65;
        double[] array_of_iterations = new double[5000];
        Generate generator = new Generate();
        ExperimentalValues experimentalValues = new ExperimentalValues();

        generator.mathematicalWaitingInput();
        generator.sigmaInput();

        for(int i=0; i<array_of_iterations.length; i++){
            array_of_iterations[i] = generator.getTheoreticalRValue(generator.getRandomSum());
        }

        System.out.println("Experimental value of m: " + experimentalValues.expM(array_of_iterations));
        System.out.println("Experimental value of sigma: " + experimentalValues.expSigma(array_of_iterations));
        //System.out.println("R':" + generator.getRandomSum());
        //System.out.println("R: " + generator.getTheoreticalRValue(generator.getRandomSum()));
    }
}