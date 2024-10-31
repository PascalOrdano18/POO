package Guias.Guia6.Ej8;

import java.util.*;

public class BagImpl<T> implements Bag<T>{

    private Map<T, Integer> col;

    public BagImpl(){
        col = new HashMap<>();
    }

    @Override
    public void add(T elem){
        if(col.containsKey(elem)){
            col.put(elem, col.get(elem) + 1);
        } else {
            col.putIfAbsent(elem, 0);
        }

    }

    @Override
    public int count(T elem){
        return col.get(elem);
    }

    @Override
    public int size(){

        int res = 0;
        for(Integer value : col.values()){
            res += value;
        }
        return res;

    }

    @Override
    public int sizeDistinct(){
        Collection<T> keys = col.keySet();
        int res = 0;
        for(T key : keys){
            res++;
        }
        return res;
    }


    @Override
    public void remove(T elem){
        int aux = col.get(elem);
        if(aux == 0){
            throw new NoSuchElementException();
        }
        col.put(elem, aux - 1);
    }

    @Override
    public boolean contains(T elem){
        return col.containsKey(elem) && col.get(elem) > 0;
    }

}
