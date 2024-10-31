package Parciales.PrimerosParciales.Reports;

import java.util.Arrays;
import java.util.Comparator;

public class MaxToMinReport <R> extends MinToMaxReport <R> {

    public MaxToMinReport(Comparator<? super R> comparator){
        super(new Comparator<R>() {
            @Override
            public int compare(R o1, R o2){
                return comparator.compare(o2, o1);
            }
        });
    }

}
