package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2024.Recu1.Ej1;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public interface GroupMatchCollection<E> extends List<E> {
    void addMatchPredicate(Predicate<E> predicate);

    Map<Integer, Collection<E>> groupingByMatches();
}
