package Parciales.SegundosParciales.Practicas2doParcial.Ej1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T>{

    public <E> Map<E, T> toMap(Function<T, E> mapper){
        Map<E, T> res = new HashMap<>();
        for(T e : this){
            res.putIfAbsent(mapper.apply(e), e);
        }
        return res;
    }

}
