package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C1A2024.Ej1;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Predicate;

public interface MatchCollection<T extends Comparable<? super T>> extends List<T> {

    void addMatchPredicate(Predicate<T> predicate);

    SortedSet<T> getAllMatched();

    default SortedSet<T> getAllMatchedReversed(){
        return getAllMatched().reversed();
    }

}
