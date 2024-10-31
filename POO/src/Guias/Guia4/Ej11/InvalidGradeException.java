package Guias.Guia4.Ej11;

public class InvalidGradeException extends Exception{
    private static final String MESSAGE = "Grado Invalido";

    public InvalidGradeException(){
        super(MESSAGE);
    }
}
