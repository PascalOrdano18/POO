package Taller.Taller7.Ej1;

import java.util.HashSet;
import java.util.Objects;

public class Citizen {
    private int dni;
    private String nombre;
    private String apellido;

    public Citizen(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object obj){
        return obj instanceof Citizen other &&
                dni == other.dni &&
                nombre.equals(other.nombre) &&
                apellido.equals(other.apellido);
    }

    @Override
    public int hashCode(){
        return Objects.hash(dni, nombre, apellido);
    }


    @Override
    public String toString() {
        return "DNI: %d \t Name: %s \t Apellido: %s".formatted(dni, nombre, apellido);
    }
}

