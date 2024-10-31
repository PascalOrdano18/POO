package Guias.Guia7.Ej3;

import java.util.Iterator;

public class ConcatIterator<T> implements Iterator<T> {

    private Iterator<T> currentIterator, nextIterator;

    public ConcatIterator(Iterator<T> iteratorLeft, Iterator<T> iteratorRight){
        this.currentIterator = iteratorLeft;
        this.nextIterator = iteratorRight;
    }

    @Override
    public boolean hasNext(){
        if(!currentIterator.hasNext()){
            currentIterator = nextIterator;
        }
        return currentIterator.hasNext();
    }

    @Override
    public T next(){
        if(!currentIterator.hasNext()){
            throw new RuntimeException();
        }
        return currentIterator.next();
    }

}
