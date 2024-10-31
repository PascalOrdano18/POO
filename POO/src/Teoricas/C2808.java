package Teoricas;

public class C2808 {
    //ENUMS
    public enum Rating{
        SUCCESS, GOOD, REGULAR, BAD
    }

    public static String toString(Rating rating){
        if (rating == null){
            return "";
        }   // ESTE APROACH ES IMPERATIVOOOOO
        return switch(rating){
            case SUCCESS -> "Success";
            case GOOD -> "Good";
            case REGULAR -> "Regular";
            case BAD -> "Bad";
            default -> "";
        };
    }
}
