package Guias.Guia4.Ej11;

public class InvalidIndexException extends Exception{
    private static final String MESSAGE = "Indice %d invalido";

    public InvalidIndexException(int index){
        super(MESSAGE.formatted(index));
    }
}
