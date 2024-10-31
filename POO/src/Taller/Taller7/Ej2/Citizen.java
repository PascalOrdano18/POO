package Taller.Taller7.Ej2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class Citizen implements Comparable<Citizen>{
    private int dni;
    private String nombre;
    private String apellido;

    public Citizen(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public int getDni(){
        return dni;
    }

    @Override
    public int compareTo(Citizen other){
        return Integer.compare(dni, other.dni);
    }


    @Override
    public String toString() {
        return "DNI: %d \t Name: %s \t Apellido: %s".formatted(dni, nombre, apellido);
    }
}


