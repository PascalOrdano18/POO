package Parciales.PrimerosParciales.Bartoooo;

import java.util.Arrays;
import java.util.Comparator;

public class TVSeason {


    private TVEpisode[] elements;

    public TVSeason(TVEpisode[] elements){
        this.elements = elements;
    }


    private TVEpisode[] getCopy(Comparator<TVEpisode> comparator){
        TVEpisode[] res = Arrays.copyOf(elements, elements.length);
        Arrays.sort(res, comparator);
        return res;
    }

    private int unTie(TVEpisode o1, TVEpisode o2){
        return o1.getId() - o2.getId();
    }

    public TVEpisode[] getDateOrderCopy(){
        return getCopy(new Comparator<TVEpisode>() {
            @Override
            public int compare(TVEpisode o1, TVEpisode o2) {
                int cmp = o2.getAiredDate().compareTo(o1.getAiredDate());
                if(cmp == 0){
                    cmp = unTie(o1, o2);
                }
                return cmp;
            }
        });
    }

    public TVEpisode[] getNameOrderCopy(){
        return getCopy(new Comparator<TVEpisode>() {
           @Override
           public int compare(TVEpisode o1, TVEpisode o2){
               int cmp = o1.getTitle().compareTo(o2.getTitle());
               if(cmp == 0){
                   cmp = unTie(o1, o2);
               }
               return cmp;
           }
        });
    }


    public TVEpisode[] getRatingOrderCopy(){
        return getCopy(new Comparator<TVEpisode>(){
            @Override
            public int compare(TVEpisode o1, TVEpisode o2){
                int cmp = Double.compare(o2.getRating(), o1.getRating());
                if(cmp == 0){
                    cmp = unTie(o1, o2);
                }
                return cmp;
            }
        } );
    }
}
