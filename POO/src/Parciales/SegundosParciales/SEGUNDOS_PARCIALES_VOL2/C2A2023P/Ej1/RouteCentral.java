package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2A2023P.Ej1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public class RouteCentral {

    private Map<String, Map<String, Integer>> routesAndCosts = new HashMap<>();
             // from -> to -> cost
    public UnaryOperator<Integer> function;

    private boolean validRoute(String from, String to){
        return routesAndCosts.containsKey(from) && routesAndCosts.get(from).containsKey(to);
    }

    public RouteCentral(UnaryOperator<Integer> function){
        this.function = function;
    }

    // eze -> scl
    // scl -> eze
    // aaa -> bbb
    // eze -> aaa

    public void addOneWayRoute(String from, String to, Integer miles){
        if(routesAndCosts.containsKey(from) && routesAndCosts.get(from).containsKey(to)){
            return ;
        }
        routesAndCosts.putIfAbsent(from, new HashMap<>());
        routesAndCosts.get(from).put(to, miles);
    }

    public Integer getDirectRouteMiles(String from, String to){
        if(!validRoute(from, to)){
            throw new IllegalArgumentException("Route does not exist");
        }
        return routesAndCosts.get(from).get(to);
    }

    public void changeRouteCost(String from, String to, Integer newCost){
        if(!validRoute(from, to)){
            throw new IllegalArgumentException("Route does not exist");
        }
        routesAndCosts.get(from).put(to, newCost);
    }

    public void addTwoWayRoute(String from, String to, Integer cost){
        Integer newCost = function.apply(cost);
        addOneWayRoute(from, to, newCost);
        addOneWayRoute(to, from, newCost);
    }

    public Integer getOneStopRouteMiles(String from, String mid, String to){
        if(!validRoute(from, mid) || !validRoute(mid, to)){
            throw new IllegalArgumentException("Route does not exist");
        }
        return getDirectRouteMiles(from, mid) + getDirectRouteMiles(mid, to);
    }




}
