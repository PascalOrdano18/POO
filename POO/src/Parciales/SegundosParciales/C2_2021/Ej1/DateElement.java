package Parciales.SegundosParciales.C2_2021.Ej1;

import java.time.LocalDate;


public class DateElement<T extends Comparable<? super T>> implements Comparable<DateElement<T>>{
    T elem;
    LocalDate date;

    public DateElement(T elem, LocalDate date){
        this.elem = elem;
        this.date = date;
    }

    public int compareTo(DateElement<T> other){
        int cmp = this.date.compareTo(other.date);
        if(cmp == 0){
            cmp = other.elem.compareTo(this.elem);
        }
        return cmp;
    }

    public T getElem(){
        return elem;
    }

    public LocalDate getDate(){
        return date;
    }

}
