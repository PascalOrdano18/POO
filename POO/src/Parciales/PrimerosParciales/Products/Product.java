package Parciales.PrimerosParciales.Products;

public class Product {
    private final String name;
    private final double basePrice;
    private final Brand brand;

    public Product(String name, Brand brand, double basePrice){
        this.name = name;
        this.brand = brand;
        this.basePrice = basePrice;
    }

    // Para devices
    public double getFinalPrice(Warranty warranty) {
        return getFinalPrice() + warranty.getCost(basePrice);
    }

    // Para accessories
    public double getFinalPrice() {
        return brand.applyDiscount(basePrice);
    }

    public String getName(){
        return name;
    }

    public Brand getBrand(){
        return brand;
    }

}
