package Parciales.PrimerosParciales.Products;

public class Device extends Product{

    private final EnergyLevel eLevel;

    public Device(String name, Brand brand, double basePrice, EnergyLevel eLevel){
        super(name, brand, basePrice);
        this.eLevel = eLevel;
    }

//    public double getFinalPrice() {
//        return super.getFinalPrice() + energyLabel.getTax(getBasePrice());
//    }


    @Override
    public String toString(){
        return "[Device] %s from %s with price %s with Energy Level %s".formatted(super.getName(), super.getBrand().toString(), getFinalPrice(), eLevel.toString());
    }


}
