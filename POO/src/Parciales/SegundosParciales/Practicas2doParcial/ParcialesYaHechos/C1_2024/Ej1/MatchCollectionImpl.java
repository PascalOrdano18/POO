package Parciales.SegundosParciales.Practicas2doParcial.ParcialesYaHechos.C1_2024.Ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;

public class MatchCollectionImpl<T extends Comparable<? super T>> extends ArrayList<T> implements MatchCollection<T> {

    List<Predicate<T>> predicates = new ArrayList<>();

    public void addMatchPredicate(Predicate<T> pred){
        predicates.add(pred);
    }

    public SortedSet<T> getAllMatched(){
        SortedSet<T> res = new TreeSet<>();
        for(T elem : this){
            boolean passesPredicate = true;
            for(Predicate<T> pred : predicates){
                if(!pred.test(elem)){
                    passesPredicate = false;
                }
            }
            if(passesPredicate){
                res.add(elem);
            }
        }
        return res;
    }
}
