package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.Practica.Ej4;

public class Passenger {
    private String name;
    private int row;
    private PassengerCategory caetogry;

    public Passenger (String name, int row, PassengerCategory caetogry){
        this.caetogry = caetogry;
        this.name = name;
        this.row = row;
    }

    public String getName() {
        return name;
    }

    public int getRow() {
        return row;
    }

    public PassengerCategory getCaetogry() {
        return caetogry;
    }
}
