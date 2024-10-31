package Parciales.PrimerosParciales.Reports;

import java.util.Arrays;
import java.util.Comparator;

public class MinToMaxReport <R> implements ReportCollection <R>{
    private final Comparator <? super R> comparator;
    private final int INITIAL_DIM = 5;
    protected int dim = 0;

    @SuppressWarnings("unchecked")
    R[] reportArray = (R[]) new Object[INITIAL_DIM];

    public MinToMaxReport (Comparator <? super R> cmp){
        this.comparator = cmp;
    }

    @Override
    public void add(R report){
        memo();
        reportArray[dim++] = report;
    }

    private void memo(){
        if(dim == reportArray.length){
            reportArray = Arrays.copyOf(reportArray, dim + INITIAL_DIM);
        }
    }


    // Retorna Reports en orden de insercion
    @Override
    public R get(int i){
        return reportArray[i];
    }


    @Override
    public R[] reports(){
        R[] res = Arrays.copyOf(reportArray, dim);
        Arrays.sort(res, comparator);
        return res;
    }
}
