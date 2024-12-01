package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C1A2024.Ej2;

import Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2A2022.Ej2.Policies;
import com.sun.source.tree.Tree;

import java.time.YearMonth;
import java.util.*;

public class ReimbursementTracker {
    private Map<String, Integer> maxAmounts = new HashMap<>();
               // client -> maxAmount
    private Map<String, SortedMap<YearMonth, Integer>> reimbursementsPerMonth = new HashMap<>();
              // client -> (month -> amount)


    private boolean validateClient(String name){
        return maxAmounts.containsKey(name);
    }

    public void registerClient(String name, Integer maxAmount){
        maxAmounts.put(name, maxAmount);
        reimbursementsPerMonth.put(name, new TreeMap<>());
    }

    public Integer getRemainingReimbursement(String name, YearMonth date){
        if(!validateClient(name)){
            throw new IllegalArgumentException("Client not registered");
        }
        return maxAmounts.get(name) - reimbursementsPerMonth.getOrDefault(name, new TreeMap<>()).getOrDefault(date, 0);
    }

    public void addReimbursement(String name, YearMonth date, Integer amount){
        if(!validateClient(name)){
            throw new IllegalArgumentException("Client not registered");
        }
        if(maxAmounts.get(name) < (reimbursementsPerMonth.getOrDefault(name, new TreeMap<>()).getOrDefault(date, 0) + amount)){
            throw new IllegalArgumentException("Reimbursement surpasses month cap");
        }
        reimbursementsPerMonth.getOrDefault(name, new TreeMap<>()).put(date, amount + reimbursementsPerMonth.getOrDefault(name, new TreeMap<>()).getOrDefault(date, 0));
    }

    public Set<Map.Entry<YearMonth, Integer>> getReimbursements(String name, YearMonth from, YearMonth to){
        if(!validateClient(name)){
            throw new IllegalArgumentException("Client not registered");
        }
        return reimbursementsPerMonth.getOrDefault(name, new TreeMap<>()).subMap(from, to).entrySet();
    }

}
