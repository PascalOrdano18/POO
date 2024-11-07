package Parciales.SegundosParciales.Practicas2doParcial.ParcialesYaHechos.C1_2024.Ej2;


import java.time.YearMonth;
import java.util.*;

public class ReimbursementTracker {

    Map<String, Integer> topAmounts = new HashMap<>();
    Map<String, SortedMap<YearMonth, Integer>> amounts = new HashMap<>();

    public void registerClient(String name, int amount){
        if(topAmounts.get(name) != null){
            throw new IllegalArgumentException("Client %s already registered".formatted(name));
        }
        topAmounts.put(name, amount);
    }

    public int getRemainingReimbursement(String name, YearMonth date){
        validateClient(name);
        return amounts.get(name).getOrDefault(date, topAmounts.get(name));
    }

    public void addReimbursement(String name, YearMonth date, int amount){
        validateClient(name);
        if((topAmounts.get(name) - amounts.getOrDefault(name, new TreeMap<>()).getOrDefault(date, 0) - amount) < 0){
            throw new IllegalArgumentException("Reimbursement surpasses month cap.");
        }
        amounts.getOrDefault(name, new TreeMap<>()).put(date, (amounts.get(name).getOrDefault(date, 0) + amount));
    }

    public Set<Map.Entry<YearMonth, Integer>> getReimbursements(String name, YearMonth from, YearMonth to){
        validateClient(name);
        return amounts.getOrDefault(name, new TreeMap<>()).subMap(from, to).entrySet();
    }


    private void validateClient(String name){
        if(topAmounts.get(name) == null){
            throw new IllegalArgumentException("Client %s is not registered".formatted(name));
        }
    }




}
