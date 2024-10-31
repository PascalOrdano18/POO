package Parciales.PrimerosParciales.Products;

public enum EnergyLevel {
    A(0.0),
    B(0.1),
    C(0.2);

    private final double rate;

    EnergyLevel(double rate){
        this.rate = rate;
    }

    public double getTax(double price){
        return price * rate;
    }


}
