package Parciales.SegundosParciales.C2_2021.Ej2;

public enum Membership {
    BEGINNER(4),
    ADVANCED(8),
    PRO(-1);  // unlimited

    int visits;
    Membership(int visits){
        this.visits = visits;
    }

}
