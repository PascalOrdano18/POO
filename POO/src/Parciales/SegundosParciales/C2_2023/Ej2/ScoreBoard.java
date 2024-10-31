package Parciales.SegundosParciales.C2_2023.Ej2;

import java.util.*;

public class ScoreBoard<T extends Comparable<? super T>> extends TreeSet<PlayerScore<T>>{
    private SortedSet<PlayerScore<T>> collection = new TreeSet<>();

    public List<PlayerScore<T>> getTopScores(int n){
        List<PlayerScore<T>> res = new ArrayList<>();
        Iterator<PlayerScore<T>> it = iterator();
        while(n > 0 && it.hasNext()){
            res.add(it.next());
            n--;
        }
        return res;
    }


}
