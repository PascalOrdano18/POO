package Parciales.SegundosParciales.C2_2022.Ej1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MysteryCollectionImpl<T extends Comparable<? super T>> extends TreeSet<T> implements MysteryCollection<T> {

    public MysteryCollectionImpl(){
        super(Comparator.reverseOrder());
    }

    public <E extends Comparable<? super E>> ArrayList<Pair<T, E>> zip(MysteryCollection<E> mc){

        ArrayList<Pair<T, E>> res = new ArrayList<>();

        Iterator<T> it = this.iterator();
        Iterator<E> mcIt = mc.iterator();

        while(it.hasNext() && mcIt.hasNext()){
            res.add(new Pair<>(it.next(), mcIt.next()));
        }
        return res;
    }
}
