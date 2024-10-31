package Guias.Guia6.Ej6;

import java.util.List;

public interface PersonCollection {

    void addPerson(Person person);

    List<Person> findByLastName(String lastName);

    Person findByName(String firstName, String lastName);

}

