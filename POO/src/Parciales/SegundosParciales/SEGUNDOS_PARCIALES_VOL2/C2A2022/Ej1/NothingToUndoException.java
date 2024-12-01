package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2A2022.Ej1;

public class NothingToUndoException extends RuntimeException{
    private static final String MESSAGE = "Nothing to undo exception";
    public NothingToUndoException(){
        super(MESSAGE);
    }
}
