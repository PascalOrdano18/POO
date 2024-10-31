package Parciales.PrimerosParciales.Episodes;

import java.util.Arrays;
import java.util.Comparator;

public class TVSeason {

    private TVEpisode[] tvEpisodes;

    public TVSeason(TVEpisode[] tvEpisodes){
        this.tvEpisodes = tvEpisodes;
    }

    private TVEpisode[] getSortedCopy(Comparator<TVEpisode> comparator){
        TVEpisode[] res = Arrays.copyOf(this.tvEpisodes, tvEpisodes.length);
        Arrays.sort(res, comparator);
        return res;
    }

    // CON LAMBDA FUNCTION 
    public TVEpisode[] getDateOrderCopy() {
        return getSortedCopy( (TVEpisode o1, TVEpisode o2) -> {
            int cmp = o2.getAiredDate().compareTo(o1.getAiredDate());
            if(cmp == 0){
                cmp = sortById(o1, o2);
            }
            return cmp;
        } );
    }

    public TVEpisode[] getNameOrderCopy(){
        return getSortedCopy( new Comparator<TVEpisode>(){
            @Override
            public int compare(TVEpisode o1, TVEpisode o2){
                int cmp = o1.getTitle().compareTo(o2.getTitle());
                if(cmp == 0){
                    sortById(o1, o2);
                }
                return cmp;
            }
        } );
    }


    public TVEpisode[] getRatingOrderCopy(){
        return getSortedCopy(new Comparator<TVEpisode>() {
            @Override
            public int compare(TVEpisode o1, TVEpisode o2){
                int cmp = Double.compare(o2.getRating(), o1.getRating());
                if(cmp == 0){
                    sortById(o1, o2);
                }
                return cmp;
            }
        });
    }


    private int sortById(TVEpisode o1, TVEpisode o2){
        return o1.getId() - o2.getId();
    }




}
