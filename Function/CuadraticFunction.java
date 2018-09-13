package prog2.Function;

public class CuadraticFunction implements Function {
    double a2;
    double a1;
    double a0;
    public CuadraticFunction(double a2, double a1, double a0){
        this.a2 = a2;
        this.a1 = a1;
        this.a0 = a0;
    }

    public double evaluate(double value){
        double result = a2*value*value + a1*value + a0;
        return result;
    }
}
