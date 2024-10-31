package Parciales.PrimerosParciales.VIP;

import Guias.Guia5.Ej1.Pair;

public class Passenger {
    private final String name;
    private final String airline;
    private int passes;

    public Passenger(String name, String airline, int passes){
        this.name = name;
        this.airline = airline;
        this.passes = passes;
    }

    public int getPasses(){
        return passes;
    }

    public void usePass(){
        passes--;
    }

    public String getAirline(){
        return airline;
    }


}
