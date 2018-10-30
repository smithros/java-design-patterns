package ProbabilityLab2;

class ExperimentalValues {
    private double expM = 0;
    private double dispercy = 0;

    double expM(double[] arr){
        for(double i:arr)
            expM += i;
        expM = expM / ((double) arr.length);
        return expM;
    }

    double expSigma(double[] arr){
        for(double i:arr)
            dispercy += (i-expM)*(i + expM);
        dispercy = dispercy / ((double) arr.length);
        return Math.sqrt(dispercy);
    }
}