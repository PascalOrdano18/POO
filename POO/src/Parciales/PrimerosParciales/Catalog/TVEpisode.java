package Parciales.PrimerosParciales.Catalog;

import java.time.LocalDate;

public class TVEpisode extends VideoCatalogElement{
    private final int season;


    public TVEpisode(String title, LocalDate airedDate, int season) {
        super(title, airedDate);
        this.season = season;
    }

    @Override
    public String toString(){
        return super.toString() + "is a TV Episode of Season %d".formatted(season);
    }
}

