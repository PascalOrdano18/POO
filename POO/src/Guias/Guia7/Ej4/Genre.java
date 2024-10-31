package Guias.Guia7.Ej4;

public enum Genre {
    FANTASY("fantasy"),
    FICTION("fiction"),
    DRAMA("drama"),
    CHILDREN("chilren");

    private final String name;

    Genre(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}


