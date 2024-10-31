package Parciales.SegundosParciales.C1_2024.Ej1;

import java.util.*;
import java.util.function.Predicate;

public class MatchCollectionImpl<T extends Comparable<? super T>> extends ArrayList<T> implements MatchCollection<T> {

    private final List<Predicate<T>> predicateList = new ArrayList<>();

    @Override
    public void addMatchPredicate(Predicate<T> predicate){
        predicateList.add(predicate);
    }

    @Override
    public SortedSet<T> getAllMatched(){
        SortedSet<T> res = new TreeSet<>();
        for(T elem : this){
            boolean passes = true;
            for(Predicate<T> predicate : predicateList){
                if(!predicate.test(elem)){
                    passes = false;
                    break;
                }
            }
            if(passes){
                res.add(elem);
            }
        }
        return res;
    }
}
