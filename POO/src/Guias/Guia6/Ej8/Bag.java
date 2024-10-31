package Guias.Guia6.Ej8;

public interface Bag<T> {
    void add(T elem);

    int count(T elem);

    int size();

    int sizeDistinct();

    boolean contains(T elem);

    void remove(T elem);
}
