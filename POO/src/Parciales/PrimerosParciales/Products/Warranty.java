package Parciales.PrimerosParciales.Products;

public enum Warranty {
    BASIC {
        @Override
        public double getCost(double price) {
            return 120;
        }
    },
    PREMIUM {
        @Override
        public double getCost(double price) {
            return price * 0.2;
        }
    };

    public abstract double getCost(double price);
}
