package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2024.Recu1.Ej2;

public enum EVChargerType {
    ENTRY(5), RAPID(10), SUPER(20);


    private final double kWhCost;

    EVChargerType(double kWhCost) {
        this.kWhCost = kWhCost;
    }

    public double getkWhCost(int hours){
        return hours * kWhCost;
    }
}
