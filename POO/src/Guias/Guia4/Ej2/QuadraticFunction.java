package Guias.Guia4.Ej2;

public class QuadraticFunction implements Function{
    private final double a, b, c;

    public QuadraticFunction(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double evaluate(double x){
        return a * x * x + b * x + c;
    }

}
