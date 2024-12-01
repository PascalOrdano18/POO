package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.Practica.Ej1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T> {

    public <E> Map<E, T> toMap(Function<T, E> function){
        Map<E, T> res = new HashMap<>();

        for(T elem : this){
            res.put(function.apply(elem), elem);
        }
        return res;
    }
}
