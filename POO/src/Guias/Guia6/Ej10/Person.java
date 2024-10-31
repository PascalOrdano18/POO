package Guias.Guia6.Ej10;

import java.util.Objects;

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return "%s # %d".formatted(name, age);
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }


    @Override
    public boolean equals(Object o){
        return o instanceof Person p &&
                name.equals(p.name) &&
                age == p.age;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }

}
