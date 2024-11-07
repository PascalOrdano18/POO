package Parciales.SegundosParciales.Practicas2doParcial.ParcialesYaHechos.C12023.Ej3;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PartitionableCollection<T> extends ArrayList<T>{
    public PartitionableCollection<T> getSelected(Predicate<T> pred){
        PartitionableCollection<T> res = new PartitionableCollection<>();
        for(T elem : this){
            if(pred.test(elem)){
                res.add(elem);
            }
        }
        return res;
    }

    public PartitionableCollection<T> getRejected(Predicate<T> pred){
        return getSelected(pred.negate());
    }
}
