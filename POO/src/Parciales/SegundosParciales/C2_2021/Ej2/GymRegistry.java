package Parciales.SegundosParciales.C2_2021.Ej2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GymRegistry {
    // Mapa de Mapas
    // Map<Nombre, Map<Mes, Visitas>>
    Map<String, Map<Integer, Integer>> gymInfo = new HashMap<>();

    Map<String, Membership> membershipsMap = new HashMap<>();

    public void registerClient(String name, Membership membership){
        if(gymInfo.get(name) != null){
            throw new GymRegistryException("Client %s is already registered".formatted(name));
        }
        gymInfo.put(name, new HashMap<>());
        membershipsMap.put(name, membership);
    }

    public int visitsCount(String name, int month){
        return gymInfo.getOrDefault(name, new HashMap<>()).getOrDefault(month, 0);
    }

    public int visitsCount(String name){
        checkClient(name);
        int res = 0;
        for(int visits : gymInfo.getOrDefault(name, new HashMap<>()).values()){
            res += visits;
        }
        return res;
    }

    public GymRegistry visit(String name, int month){
        checkClient(name);
        if(!canVisit(name, month)){
            throw new GymRegistryException("Max visits reached for client %s in month %d".formatted(name, month));
        }
        gymInfo.get(name).put(month, gymInfo.get(name).getOrDefault(month, 0) + 1);
        return this;
    }

    private void checkClient(String name){
        if(gymInfo.get(name) == null){
            // EL CLIENTE NO EXISTE
            throw new GymRegistryException("Client %s is not registered".formatted(name));
        }
    }

    public boolean canVisit(String name, int month){
        checkClient(name);
        return membershipsMap.get(name).equals(Membership.PRO) || gymInfo.get(name).getOrDefault(month, 0) < membershipsMap.get(name).visits;
    }




}
