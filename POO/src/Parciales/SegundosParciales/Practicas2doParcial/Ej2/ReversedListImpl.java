package Parciales.SegundosParciales.Practicas2doParcial.Ej2;

import java.util.ArrayList;
import java.util.Iterator;

public class ReversedListImpl<T> extends ArrayList<T> implements ReversedList<T> {

    public Iterator<T> defaultIterator(){
        return super.iterator();
    }

    @Override
    public Iterator<T> iterator(){
        return new ReversedIterator();
    }

    private class ReversedIterator implements Iterator<T>{
        private int current;

        @Override
        public boolean hasNext(){
            return current < size();
        }

        @Override
        public T next(){
            if(!hasNext()){
                throw new RuntimeException();
            }
            current++;
            return get(size() - current);
        }

    }

}
