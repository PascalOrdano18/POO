package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.Practica.Ej4;

public class CategoryBoardingFlight extends BoardingFlight {

    public CategoryBoardingFlight() {
        super((o1, o2) -> {
            int cmp = o1.getCaetogry().compareTo(o2.getCaetogry());
            if (cmp != 0) {
                return cmp;
            }
            return o1.getName().compareTo(o2.getName());
        });

    }
}
