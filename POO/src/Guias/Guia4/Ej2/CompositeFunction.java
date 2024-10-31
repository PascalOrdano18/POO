package Guias.Guia4.Ej2;

public class CompositeFunction implements Function{
    private final Function f1, f2;
    public CompositeFunction(Function f1, Function f2){  // recibe dos funciones
        this.f1 = f1;
        this.f2 = f2;
    }

    public double evaluate(double x){
        return f2.evaluate(f1.evaluate(x));
    }

}
