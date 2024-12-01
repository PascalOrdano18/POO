package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.Practica.Ej4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public abstract class BoardingFlight {

    private final Set<Passenger> passengers;

    public BoardingFlight(Comparator<Passenger> passengerComparator){
        passengers = new TreeSet<>(passengerComparator);
    }

    public void addForBoarding(String name, int row, PassengerCategory category){
        passengers.add(new Passenger(name, row, category));
    }

    public Iterator<String> boardingCallIterator(){
        return new Iterator<>() {
            private final Iterator<Passenger> it = passengers.iterator();
            @Override
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override
            public String next() {
                if(!hasNext()){
                    throw new IllegalArgumentException();
                }
                return it.next().getName();
            }
        };
    }
}
