package Parciales.PrimerosParciales.Catalog;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class VideoCatalog {

    private final int INITIAL_DIM = 5;
    private VideoCatalogElement[] elements = new VideoCatalogElement[INITIAL_DIM];
    private int dim;

    private VideoCatalog addElem(VideoCatalogElement videoCatalogElement){
        memo();
        elements[dim++] = videoCatalogElement;
        return this;
    }

    public VideoCatalog add(String title, LocalDate airedDate, String studio){
        return addElem(new Movie(title, airedDate, studio));
    }

    public VideoCatalog add(String title, LocalDate airedDate, int season){
        return addElem(new TVEpisode(title, airedDate, season));
    }


    private VideoCatalogElement[] getCustomCopy(Comparator<VideoCatalogElement> cmp){
        VideoCatalogElement[] res = Arrays.copyOf(elements, dim);
//        Arrays.sort(res, order);
        return res;
    }


    public VideoCatalogElement[] getDescendingDateCopy(){
        return getCustomCopy(Comparator.naturalOrder());
    }

    public VideoCatalogElement[] getChronologicalDateCopy(){
        return getCustomCopy(Comparator.reverseOrder());
    }

    private void memo(){
        if(dim == elements.length) {
            elements = Arrays.copyOf(elements, dim + INITIAL_DIM);
        }
    }


}
