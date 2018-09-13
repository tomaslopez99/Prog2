package prog2.Function;

public class CompoundFunction implements Function {
    Function f;
    Function g;
    public CompoundFunction(Function f, Function g){
        this.f = f;
        this.g = g;
    }

    public double evaluate(double value){
        return f.evaluate(g.evaluate(value));
    }
}
