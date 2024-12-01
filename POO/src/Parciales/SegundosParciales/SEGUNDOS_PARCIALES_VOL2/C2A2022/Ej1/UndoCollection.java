package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2A2022.Ej1;

import java.util.Queue;
import java.util.Set;

public interface UndoCollection<T> extends Set<T> {
    default void undo(){
        undo(1);
    }
    int undo(int n);
}
