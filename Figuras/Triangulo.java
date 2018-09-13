package prog2.Figuras;

public class Triangulo extends Figura {
    double lado1;
    double lado2;
    double base;
    double altura;
    public Triangulo(double base, double lado1, double lado2, double altura){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    public double area(){
        return (base*altura)/2;
    }

    public double perimetro(){
        return base+lado1+lado2;
    }
}
