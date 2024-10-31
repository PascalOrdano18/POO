package Guias.Guia5.Ej5;

public class EmptyArrayException extends  RuntimeException{
    private static final String MESSAGE = "Stack is Empty";
    public EmptyArrayException(){
        super(MESSAGE);
    }
}
