package Parciales.SegundosParciales.C1_2024.Ej2;

import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

import java.nio.channels.IllegalChannelGroupException;
import java.time.Year;
import java.time.YearMonth;
import java.util.*;

public class ReimbursementTracker {

    private Map<String, SortedMap<YearMonth, Integer>> tracker = new HashMap<>();
    private Map<String, Integer> maxAmounts = new HashMap<>();

    public void registerClient(String name, int maxAmount){
        if(maxAmounts.containsKey(name)){
            throw new IllegalArgumentException("Client already registered");
        }
        maxAmounts.put(name, maxAmount);
        tracker.put(name, new TreeMap<>());
    }

    public int getRemainingReimbursement(String name, YearMonth date){
        if(!maxAmounts.containsKey(name)){
            throw new IllegalArgumentException("Client does not exist");
        }
        int am = tracker.get(name).getOrDefault(date, 0);
        return maxAmounts.get(name) - am;
    }


    // Se le reintegra al cliente, hay que restarle amount al maxAmount
    public void addReimbursement(String name, YearMonth date, int amount){
        // Solo se puede agregar si no supera al maxAmount
        if(maxAmounts.get(name) < tracker.getOrDefault(name, new TreeMap<>()).getOrDefault(date, 0)){
            throw new IllegalArgumentException("Reimbursement surpasses month cap.");
        }
        tracker.getOrDefault(name, new TreeMap<>()).put(date, tracker.getOrDefault(name, new TreeMap<>()).getOrDefault(date, 0) + amount);
    }

    public Set<Map.Entry<YearMonth, Integer>> getReimbursements(String name, YearMonth from, YearMonth to){
        if(!maxAmounts.containsKey(name)){
            throw new IllegalArgumentException("Client not registered");
        }
        return tracker.getOrDefault(name, new TreeMap<>()).subMap(from, to).entrySet();
    }
}
