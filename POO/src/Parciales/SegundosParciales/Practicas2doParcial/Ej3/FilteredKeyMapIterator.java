package Parciales.SegundosParciales.Practicas2doParcial.Ej3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class FilteredKeyMapIterator<E, T> implements Iterator<E> {

    private final Iterator<E> iterator;
    private final Map<E, T> map;
    private final Predicate<E> criteria;
    private T currentValue;

    public FilteredKeyMapIterator(Map<E, T> map, Predicate<E> criteria){
        this.iterator = map.keySet().iterator();
        this.map = map;
        this.criteria = criteria;
    }



    @Override
    public boolean hasNext(){
        return iterator.hasNext();
    }

    @Override
    public E next(){
        while(hasNext()){
            E res = iterator.next();
            if(criteria.test(res)){
                currentValue = map.get(res);
                return res;
            }
        }
        throw new NoSuchElementException();
    }

    public T getValue(){
        if(currentValue == null){
            throw new NoSuchElementException();
        }
        return currentValue;
    }
}
