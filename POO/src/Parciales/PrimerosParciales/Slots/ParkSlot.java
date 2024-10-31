package Parciales.PrimerosParciales.Slots;

import java.time.LocalTime;

public class ParkSlot {
    private final LocalTime time;
    private final String name;
    public ParkSlot(String name, LocalTime time){
        this.time = time;
        this.name = name;
    }

    public String toString(){
        return "%s <> %s Slot".formatted(name, time);
    }
}
