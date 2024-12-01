package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.Practica.Ej4;

import java.util.Comparator;

public class RowBoardingFlight extends BoardingFlight{
    public RowBoardingFlight(){
        super((o1, o2) -> o1.getRow() - o2.getRow());
    }
}
