package Parciales.PrimerosParciales.Aviones;

public class Counter{
    private boolean checkedIn = false;
    private final String airline;
    private int index;
    public Counter(String airline, int index){
        this.airline = airline;
        this.index = index;
    }

    public void checkIn(){
        checkedIn = true;
    }

    public String getAirline(){
        return airline;
    }

    public boolean isCheckedIn(){
        return checkedIn;
    }

    public int getIndex(){
        return index;
    }

}
