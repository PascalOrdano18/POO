package Parciales.PrimerosParciales.Catalog;

import java.time.LocalDate;
import java.util.Comparator;

public abstract class VideoCatalogElement implements Comparable <VideoCatalogElement> {

    private final String title;
    private final LocalDate airedDate;

    public VideoCatalogElement(String title, LocalDate airedDate){
        this.title = title;
        this.airedDate = airedDate;
    }

    @Override
    public int compareTo(VideoCatalogElement o){
        int cmp = o.airedDate.compareTo(this.airedDate);
        if(cmp == 0){
            cmp = o.title.compareTo(this.title);
        }
        return cmp;
    }

    @Override
    public String toString(){
        return "%s aired on %s".formatted(title, airedDate);
    }





}
