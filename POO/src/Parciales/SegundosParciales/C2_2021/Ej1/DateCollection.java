package Parciales.SegundosParciales.C2_2021.Ej1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class DateCollection<T extends Comparable<? super T>> extends TreeSet<DateElement<T>> {

    private LocalDate currentDate;

    public DateCollection(LocalDate date){
        this.currentDate = date;
    }

    @Override
    public boolean add(DateElement<T> dateElem){
        if(dateElem.getDate().isAfter(this.currentDate)){
            throw new IllegalArgumentException();
        }
        return super.add(dateElem);
    }

    public List<T> getElementsBeforeToday(){
        return getElementsBefore(this.currentDate);
    }

    public void changeToday(LocalDate newDate){
        this.currentDate = newDate;
    }

    public List<T> getElementsBefore(LocalDate date){
        List<T> res = new ArrayList<>();
        for(DateElement<T> dateElem : this){
            if(date.isAfter(dateElem.getDate())){
                res.add(dateElem.getElem());
            }
        }
        return res;
    }
}
