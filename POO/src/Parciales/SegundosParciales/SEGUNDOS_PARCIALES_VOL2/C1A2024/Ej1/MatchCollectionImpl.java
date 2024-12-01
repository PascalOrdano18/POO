package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C1A2024.Ej1;

import java.util.*;
import java.util.function.Predicate;

public class MatchCollectionImpl<T extends Comparable<? super T>> extends ArrayList<T> implements MatchCollection<T> {

    private List<Predicate<T>> predicates = new ArrayList<>();

    public void addMatchPredicate(Predicate<T> predicate){
        predicates.add(predicate);
    }

    public SortedSet<T> getAllMatched(){
        SortedSet<T> res = new TreeSet<>();
        for(T elem : this){
            boolean canAdd = true;
            for(Predicate<T> pred : predicates){
                if(!pred.test(elem)){
                    canAdd = false;
                }
            }
            if(canAdd){
                res.add(elem);
            }
        }
        return res;
    }

}
