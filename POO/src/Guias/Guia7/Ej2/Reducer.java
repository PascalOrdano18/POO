package Guias.Guia7.Ej2;

@FunctionalInterface
public interface Reducer<A, V> {
    A reducerMethod(A accum, V value);
}
