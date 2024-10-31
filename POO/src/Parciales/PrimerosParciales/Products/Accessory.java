package Parciales.PrimerosParciales.Products;

public class Accessory extends Product {

    private final String feature;

    public Accessory(String name, Brand brand, double basePrice, String feature) {
        super(name, brand, basePrice);
        this.feature = feature;
    }

    public String toString(){
        return "[Accessory] %s from %s with price %s with feature %s".formatted(super.getName(), super.getBrand().toString(), super.getFinalPrice(), feature);
    }

}