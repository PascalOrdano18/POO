package Guias.Guia5.Ej1;

import java.util.Objects;

public class Pair<A,B> {
    private A first;
    private B second;


    public Pair(A first, B second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString(){
        return "[%s, %s]".formatted(first, second);
    }

    @Override
    public int hashCode(){
        return Objects.hash(first, second);
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Pair<?, ?> pair &&
                first.equals(pair.first) &&
                second.equals(pair.second);
    }

    public A getFirst(){
        return first;
    }
    public B getSecond(){
        return second;
    }

    public void setFirst(A newVal){
        first = newVal;
    }

    public void setSecond(B newVal){
        second = newVal;
    }



}
