package Guias.Guia6.Ej5;

import java.util.ArrayList;
import java.util.List;

public class CompositeFunction implements Function {
    private List<Function> fn;

    public CompositeFunction(){   // crea una lista vacia, fn, que almacena objetos de tipo Function
        fn = new ArrayList<>();   // ArrayList permite anadir objetos dinamicamente sin la necesidad de definir un tamano
    }

    public void addFunction(Function function){
        fn.add(function);
    }

    @Override
    public double evaluate(double x){
        double answer = x;

        if(fn.isEmpty()){
            throw new IllegalStateException();
        }
        for(Function fun: fn){
            answer = fun.evaluate(x);
        }
        return answer;
    }


}
