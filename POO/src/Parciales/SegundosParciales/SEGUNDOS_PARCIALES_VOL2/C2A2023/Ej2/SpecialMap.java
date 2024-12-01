package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2A2023.Ej2;

import java.util.*;

public class SpecialMap<E, T extends Comparable<? super T>> extends HashMap<E, T> {


    public SortedMap<T, Collection<E>> groupByComparator(Comparator<T> cmp){
        SortedMap<T, Collection<E>> res = new TreeMap<>(cmp);
        for(Map.Entry<E, T> elem : this.entrySet()){
            if(res.get(elem.getValue()) == null){
                res.put(elem.getValue(), new ArrayList<>());
            }
            res.get(elem.getValue()).add(elem.getKey());
        }
        return res;
    }

    public SortedMap<T, Collection<E>> groupByValue(){
        return groupByComparator(Comparator.naturalOrder());
    }

    public SortedMap<T, Collection<E>> groupByValueReversed(){
        return groupByComparator(Comparator.reverseOrder());
    }

}
