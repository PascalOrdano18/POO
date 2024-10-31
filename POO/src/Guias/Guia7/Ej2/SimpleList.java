package Guias.Guia7.Ej2;

import java.util.List;

public interface SimpleList<T> extends List<T> {
    <E> E reduce(E initialValue, Reducer<E, T> reducer);
}
