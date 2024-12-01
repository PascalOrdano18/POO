package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C1A2023.Ej1;

public enum UserLevel {
    GREEN(3),
    GOLD(1),
    BLACK(0);

    final int level;

    UserLevel(int level){
        this.level = level;
    }


    public boolean canReview(int reviews){
        return reviews >= level;
    }

}
