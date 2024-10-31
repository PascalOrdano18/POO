package Parciales.PrimerosParciales.Slots;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParkRide implements Iterable<ParkSlot>{

    private final String name;
    private final LocalTime open;
    private LocalTime close;
    private final int slot;

    public ParkRide(String name, LocalTime open, LocalTime close, int slot){
        this.name = name;
        this.open = open;
        this.close = close;
        this.slot = slot;
    }

    public void setCloseTime(LocalTime newCloseTime){
        if(newCloseTime.isBefore(open)){
            throw new IllegalArgumentException("Close cant be before Opening");
        }
        close = newCloseTime;
    }

    @Override
    public Iterator<ParkSlot> iterator(){
        return new Iterator<> (){
            private LocalTime current = open;
            private final LocalTime closeIt = close;

            public boolean hasNext(){
                return current.isBefore(closeIt);
            }

            public ParkSlot next(){
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                ParkSlot newP = new ParkSlot(name, current);
                current = current.plusMinutes(slot);
                return newP;
            }
        };
    }



}
