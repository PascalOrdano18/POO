package Parciales.PrimerosParciales.Iterations;

import java.util.Iterator;
import java.util.function.UnaryOperator;

public class CustomIndex <T> implements Iterable <T>{

    private final int start, end;
    private final T[] elements;
    private UnaryOperator<Integer> nextIndex;

    public CustomIndex(T[] elements, int start, int end, UnaryOperator<Integer> nextIndex){
        if(end <= start){
            throw new IllegalArgumentException("Invalid combination of start and end index");
        }
        this.elements = elements;
        this.start = start;
        this.end = end;
        setNextIndex(nextIndex);
    }

    public void setNextIndex(UnaryOperator<Integer> nextIndex){
        this.nextIndex = nextIndex;
    }

    public Iterator<T> iterator(){
        return new Iterator<>() {
            private UnaryOperator<Integer> itNextIndex = nextIndex;
            private int current = start;

            @Override
            public boolean hasNext(){
                return current <= end;
            }

            @Override
            public T next(){
                T res = elements[current];
                current = itNextIndex.apply(current);
                return res;
            }
        };
    }




}