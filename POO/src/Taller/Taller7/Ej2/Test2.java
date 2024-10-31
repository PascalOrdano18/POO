package Taller.Taller7.Ej2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {

    public static void main(String[] args){

        Set<Citizen> sortedCitizenSet = new TreeSet<>((o1, o2) -> {
            return (o1.getDni() - o2.getDni());
        });

        Citizen c1 = new Citizen(123, "Hola", "Mundo");
        Citizen c2 = new Citizen(456, "Hello", "World");
        Citizen c3 = new Citizen(123, "Hola", "Mundo");
        Citizen c4 = new Citizen(103, "Hola", "Mundo");

        sortedCitizenSet.add(c1);
        sortedCitizenSet.add(c2);
        sortedCitizenSet.add(c3);
        sortedCitizenSet.add(c4);


//        Set<Citizen> sortedCitizenSet = new TreeSet<>(new Comparator<Citizen>() {
//            @Override
//            public int compare(Citizen o1, Citizen o2){
//                return (o1.getDni() - o2.getDni());
//            }
//        });


        sortedCitizenSet.forEach((citizen) -> System.out.println(citizen));

    }
}
