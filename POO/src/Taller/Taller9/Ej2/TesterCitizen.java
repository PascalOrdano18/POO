package Taller.Taller9.Ej2;

public class TesterCitizen {
    public static void main(String[] args){
        Citizen sherlock = new Citizen(123,"Sherlock","Holmes");
        Citizen john = new Citizen(456,"Dr. John","Watson");
        Citizen mycroft = new Citizen(789,"Mycroft","Holmes");

        CitizenBook cb = new CitizenBook();

        cb.add(sherlock);
        cb.add(john);
        cb.add(mycroft);

        // Todos los Holmes, ordenado alfabéticamente por nombre
        for(Citizen c : cb.getByLastName("Holmes")) {
            System.out.println(c);
        }

        cb.getByLastName("Lestrade").isEmpty(); // true
    }


}
