package Parciales.SegundosParciales.Practicas2doParcial.ParcialesYaHechos.C1_2024.Ej1;

import java.util.List;
import java.util.SortedSet;
import java.util.function.Predicate;

public interface MatchCollection<T extends Comparable<? super T>> extends List<T> {

    void addMatchPredicate(Predicate<T> pred);

    SortedSet<T> getAllMatched();

    default SortedSet<T> getAllMatchedReversed(){
        return getAllMatched().reversed();
    }



}