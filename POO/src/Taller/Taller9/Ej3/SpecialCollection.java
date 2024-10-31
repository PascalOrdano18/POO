package Taller.Taller9.Ej3;

import java.util.Set;
import java.util.function.Predicate;

public interface SpecialCollection<T extends Comparable<? super T>> extends Set<T> {
    void deleteFirst(Predicate<T> predicate);

    default void deleteFirst() {
        deleteFirst(first -> true);
    }

    void undoDeleteFirst();
}
