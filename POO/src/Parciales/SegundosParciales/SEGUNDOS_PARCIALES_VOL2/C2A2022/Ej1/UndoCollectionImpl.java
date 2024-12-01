package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2A2022.Ej1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class UndoCollectionImpl<T> extends LinkedList<T> implements UndoCollection<T> {

    @Override
    public boolean add(T elem){
        if(!this.contains(elem)){
            super.add(elem);
            return true;
        }
        return false;
    }

    public int undo(int n){
        int i = n;
        while(i > 0){
            if(this.isEmpty()){
                throw new IllegalArgumentException();
            }
            this.pop();
            i--;
        }
        return i;
    }



}
