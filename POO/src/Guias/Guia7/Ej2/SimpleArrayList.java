package Guias.Guia7.Ej2;

import java.util.ArrayList;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T> {
    @Override
    public <E> E reduce(E initialValue, Reducer<E, T> reducer){
        E res = initialValue;

        for(T elem : this){
            res = reducer.reducerMethod(res, elem);
        }
        return res;
    }
}
