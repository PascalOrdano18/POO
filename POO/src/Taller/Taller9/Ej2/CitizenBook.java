package Taller.Taller9.Ej2;
import java.util.*;

public class CitizenBook {
    private Map<String, Set<Citizen>> collection = new HashMap<>();

    public void add(Citizen citizen){
        collection.putIfAbsent(citizen.getLastName(), new TreeSet<>());
        collection.get(citizen.getLastName()).add(citizen);
    }

    public Collection<Citizen> getByLastName(String lastName){
        return collection.getOrDefault(lastName, new TreeSet<>());
    }

}
