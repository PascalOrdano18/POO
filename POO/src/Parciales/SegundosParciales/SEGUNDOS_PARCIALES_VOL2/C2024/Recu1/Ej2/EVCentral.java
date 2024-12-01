package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2024.Recu1.Ej2;

import java.time.LocalDateTime;
import java.util.*;

public class EVCentral {
    private Map<String, Double> balance = new HashMap<>();
    private Map<String, SortedMap<LocalDateTime, EVChargerType>> registers = new HashMap<>();

    private boolean isRegistered(String name){
        return balance.containsKey(name);
    }

    public void register(String name){
        balance.put(name, 0.0);
        registers.putIfAbsent(name, new TreeMap<>());
    }


    public void charge(String name, LocalDateTime time, EVChargerType type, int hours){
        if(!isRegistered(name)){
            throw new IllegalArgumentException();
        }
        balance.put(name, balance.get(name) + type.getkWhCost(hours));
        registers.get(name).put(time, type);
    }

    public double balance(String name){
        if(!isRegistered(name)){
            throw new IllegalArgumentException();
        }
        return balance.get(name);
    }

    public Set<LocalDateTime> getChargeDateTimes(String name){
        if(!isRegistered(name)){
            throw new IllegalArgumentException();
        }
        return registers.get(name).keySet();
    }

    public Collection<EVChargerType> getChargerTypes(String name){
        if(!isRegistered(name)) {
            throw new IllegalArgumentException();
        }
        return registers.get(name).values();
    }

}
