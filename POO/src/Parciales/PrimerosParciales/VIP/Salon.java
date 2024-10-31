package Parciales.PrimerosParciales.VIP;

public class Salon {

    protected int guests;
    protected LoungeCentral central;
    protected final String name;

    public Salon(LoungeCentral central, String name){
        this.central = central;
        this.name = name;
    }

    public void enter(Passenger passenger){
        if(passenger.getPasses() < 1 || !central.isOpen()){
            throw new RuntimeException("Cannot enter lounge");
        }
        guests++;
        passenger.usePass();
    }

    public void exit(int n){
        if(guests < 1){
            throw new RuntimeException("Cant exit");
        }
        guests -= n;
    }

    public void exit(){
        exit(1);
    }


    @Override
    public String toString(){
        return "%s has %d guests".formatted(name, guests);
    }

    public int getGuests(){
        return guests;
    }


}
