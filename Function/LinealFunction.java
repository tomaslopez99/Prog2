package prog2.Function;

public class LinealFunction implements Function {
    double a1;
    double a0;
    public LinealFunction(double a1, double a0){
        this.a1 = a1;
        this.a0 = a0;
    }

    public double evaluate(double value){
        double result = a1*value + a0;
        return result;
    }
}
