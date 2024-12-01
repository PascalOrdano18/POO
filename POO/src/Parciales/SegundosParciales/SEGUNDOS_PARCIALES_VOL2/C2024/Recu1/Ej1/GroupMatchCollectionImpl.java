package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2024.Recu1.Ej1;

import java.util.*;
import java.util.function.Predicate;

public class GroupMatchCollectionImpl<E> extends ArrayList<E> implements GroupMatchCollection<E> {

    List<Predicate<E>> predicates = new ArrayList<>();

    @Override
    public void addMatchPredicate(Predicate<E> predicate){
        predicates.add(predicate);
    }

    @Override
    public Map<Integer, Collection<E>> groupingByMatches() {
        Map<Integer, Collection<E>> toReturn = new HashMap<>();
        for(E elem : this) {
            int matchCount = 0;
            for(Predicate<E> predicate : predicates) {
                if(predicate.test(elem)) {
                    matchCount++;
                }
            }
            toReturn.putIfAbsent(matchCount, new ArrayList<>());
            toReturn.get(matchCount).add(elem);
        }
        return toReturn;
    }

}
