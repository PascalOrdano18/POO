package Parciales.SegundosParciales.C2_2022.Ej1;

import java.util.ArrayList;
import java.util.SortedSet;

public interface MysteryCollection<T extends Comparable<? super T>> extends SortedSet<T> {
    <E extends Comparable<? super E>> ArrayList<Pair<T, E>> zip(MysteryCollection<E> mc);
}
