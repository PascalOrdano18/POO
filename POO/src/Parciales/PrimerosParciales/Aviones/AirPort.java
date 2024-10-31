package Parciales.PrimerosParciales.Aviones;

import java.util.Arrays;
import java.util.Comparator;

public class AirPort {
    protected int index = 0;
    private final int INITIAL_DIM = 5;
    private Counter []counters = new Counter[INITIAL_DIM];

    public Counter addCounter(String airline){
        memo();
        counters[index] = new Counter(airline, index);
        return counters[index++];
    }

    public Counter[] airlineOrderCounters(){
        Arrays.sort(counters, (counter1, counter2) ->  {
            int res = counter1.getAirline().compareTo(counter2.getAirline());
            return res == 0 ? (counter1.getIndex() - counter2.getIndex()): res;
        });
        return counters;
    }

    public Counter[] airlineDescendingOrderCounters(){
        Counter []newRes = airlineOrderCounters();
        int j = 0;
        for(int i = newRes.length - 1; i > j; i --){
            Counter aux = newRes[j];
            newRes[j++] = newRes[i];
            newRes[i] = aux;
        }
        return newRes;
    }

    private void memo(){
        if(index == counters.length){
            counters = Arrays.copyOf(counters, index + INITIAL_DIM);
        }
    }

    public String toString(Counter counter){
        return "Counter %d for %s is %s".formatted(counter.getIndex(), counter.getAirline(), counter.isCheckedIn() ? "checking in" : "idle");
    }


}
