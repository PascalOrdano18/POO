package Guias.Guia4.Ej12;

public class InvalidIndexxException extends RuntimeException{
    private static final String MESSAGE = "Invalid Index %d. This index doesnt exist";
    public InvalidIndexxException(int i){
        super(MESSAGE.formatted(i));
    }
}