package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2A2023.Ej1;

import java.time.LocalDate;

public class Event implements Comparable<Event> {
    private final String file;
    private final String user;
    private final LocalDate date;
    private final EventType type;

    public Event(String file, String user, LocalDate date, EventType type){
        this.file = file;
        this.user = user;
        this.date = date;
        this.type = type;
    }

    @Override
    public int compareTo(Event other){
        int cmp = this.date.compareTo(other.date);
        if(cmp == 0){
            cmp = this.type.compareTo(other.type);
        }
        return cmp;
    }

}
