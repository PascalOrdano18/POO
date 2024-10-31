package Guias.Guia7.Ej1;


import java.util.ArrayList;

public class ArrayFilterList<T> extends ArrayList<T> implements FilterList<T>{

    @Override
    public FilterList<T> filter(Criteria<T> criteria) {
        FilterList<T> res = new ArrayFilterList<>();
        for (T elem : this) {
            if (criteria.crit(elem)) {
                res.add(elem);
            }
        }
        return res;
    }
}
