package Guias.Guia6.Ej6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonCollectionImpl implements PersonCollection{

    private Map<String, Map<String, Person>> people = new HashMap<>();

    @Override
    public void addPerson(Person person){
        String lastName = person.getLastName();
        people.put(lastName, new HashMap<>());
        people.get(lastName).put(person.getFirstName(), person);
    }

    @Override
    public List<Person> findByLastName(String lastName){
        return new ArrayList<>(people.getOrDefault(lastName, new HashMap<>()).values());
    }

    @Override
    public Person findByName(String firstName, String lastName){
        return people.getOrDefault(lastName, new HashMap<>()).get(firstName);
    }

}
