package prog2.Figuras;

public class Circulo extends Figura {
    double radio;
    public Circulo(double radio){
        this.radio = radio;
    }

    public double area(){
        return radio*radio*Math.PI;
    }

    public double perimetro(){
        return Math.PI*radio*2;
    }
}
