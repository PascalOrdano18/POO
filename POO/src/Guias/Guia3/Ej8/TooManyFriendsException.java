package Guias.Guia3.Ej8;

public class TooManyFriendsException extends Exception{
    private static final String MESSAGE = "Error for number %s: too many friends";

    public TooManyFriendsException(String number){
        super (MESSAGE.formatted(number));
    }
}
