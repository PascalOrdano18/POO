package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2A2023P.Ej2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ScoreBoard<T extends Comparable<? super T>> extends TreeSet<PlayerScore<T>> {

    public List<PlayerScore<T>> getTopScores(int n){
        List<PlayerScore<T>> res = new ArrayList<>();
        Iterator<PlayerScore<T>> it = iterator();
        while(it.hasNext() && n > 0){
            res.add(it.next());
            n--;
        }
        return res;
    }

}
