package Parciales.PrimerosParciales.VIP;

public class MSalon extends Salon{
    protected int passengers;


    public MSalon(LoungeCentral central, int passengers, String name){
        super(central, name);
        this.passengers = passengers;
    }

    @Override
    public void enter(Passenger passenger){
        if(super.getGuests() >= passengers){
            throw new RuntimeException("Max limit reached");
        }
        super.enter(passenger);
    }

    @Override
    public String toString(){
        return "%s has %d guests up to %d".formatted(name, guests, passengers);
    }

}
