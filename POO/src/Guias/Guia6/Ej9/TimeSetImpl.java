package Guias.Guia6.Ej9;

import java.util.*;

public class TimeSetImpl<T> implements TimeSet<T> {

    private Map<T, Time> col = new HashMap<>();

    @Override
    public void add(T elem, int hours, int minutes){
        if(hours > 23 || hours < 0 || minutes < 0 || minutes > 59){
            throw new IllegalArgumentException();
        }
        col.put(elem, new Time(hours, minutes));
    }


    @Override
    public void remove(T elem){
        col.remove(elem);
    }

    @Override
    public int size(){
        return col.size();
    }

    @Override
    public boolean contains(T elem){
        return col.containsKey(elem);
    }

    @Override
    public Set<T> retrieve(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo){
        Set<T> res = new HashSet<>();
        for(T elem : col.keySet()){
            int h = col.get(elem).getHours();
            int m = col.get(elem).getMinutes();
            if(h >= hoursFrom && h <= hoursTo && m <= minutesTo && m >= minutesFrom){
                res.add(elem);
            }
        }
        return res;
    }

}
