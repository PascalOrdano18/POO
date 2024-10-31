package Parciales.PrimerosParciales.VIP;

public class MXSalon extends MSalon{
    private final String airline;

    public MXSalon(LoungeCentral central, int passengers, String airline, String name){
        super(central, passengers, name);
        this.airline = airline;
    }

    @Override
    public void enter(Passenger passenger){
        if(!passenger.getAirline().equals(airline)){
            throw  new RuntimeException("Passenger does not fly with this airline");
        }
        super.enter(passenger);
    }

}
