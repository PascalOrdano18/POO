package Parciales.SegundosParciales.C2_2023;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

public class RouteCentral {
    private final Function<Integer, Integer> fun;

    private final Map<String, Map<String, Integer>> collection = new HashMap<>();

    public RouteCentral(Function<Integer, Integer> fun){
        this.fun = fun;
    }

    public void addOneWayRoute(String from, String to, Integer miles){
        if(collection.containsKey(from)){
            if(!collection.get(from).containsKey(to)){
                collection.get(from).put(to, miles);
            }
        } else {
            collection.put(from, new TreeMap<>());
            collection.get(from).put(to, miles);
        }
    }

    public int getDirectRouteMiles(String from, String to){
        if(!collection.containsKey(from)){
            throw new IllegalArgumentException("Route does not exist");
        }
        return collection.get(from).get(to);
    }

    public void changeRouteCost(String from, String to, int miles){
        // Si contiene from y aparte from esta relacionado a to ->
        if(collection.containsKey(from) && collection.get(from).containsKey(to)){
                collection.get(from).put(to, miles);
        } else {
            throw new IllegalArgumentException("Route does not exists");
        }
    }

    public void addTwoWayRoute(String from, String to, int totalMiles){
        int val = fun.apply(totalMiles);
        addOneWayRoute(from, to, val);
        addOneWayRoute(to, from, val);
    }

    public int getOneStopRouteMiles(String from, String mid, String to){
        // Si existe from y esta relacionado a mid y existe mid ->
        if(collection.containsKey(from) && collection.get(from).containsKey(mid) && collection.containsKey(mid) && collection.get(mid).containsKey(to)){
            return collection.get(from).get(mid) + collection.get(mid).get(to);
        } else {
            System.out.println(collection.get(mid).containsKey(to));
            throw new IllegalArgumentException("No such trip exists");
        }
    }
}
