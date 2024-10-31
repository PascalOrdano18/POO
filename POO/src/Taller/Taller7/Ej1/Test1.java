package Taller.Taller7.Ej1;

import java.util.HashSet;
import java.util.Set;

public class Test1 {

    public static void main(String[] args){
        Set<Citizen> citizenSet = new HashSet<>();

        Citizen c1 = new Citizen(123, "Hola", "Mundo");
        Citizen c2 = new Citizen(456, "Hello", "World");
        Citizen c3 = new Citizen(123, "Hola", "Mundo");
        Citizen c4 = new Citizen(103, "Hola", "Mundo");

        citizenSet.add(c1);
        citizenSet.add(c2);
        citizenSet.add(c3);
        citizenSet.add(c4);

        citizenSet.forEach((citizen) -> System.out.println(citizen));

    }
}
