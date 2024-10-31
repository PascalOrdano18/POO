package Guias.Guia3.Ej8;

public class AlreadyExistsFriendException extends Exception{
    private static final String MESSAGE = "Error for number %s: This friend already exists";

    public AlreadyExistsFriendException(String number){
        super (MESSAGE.formatted(number));
    }

}
