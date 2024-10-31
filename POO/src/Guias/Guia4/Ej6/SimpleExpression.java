package Guias.Guia4.Ej6;

public class SimpleExpression extends Expression{
    private boolean value;

    public SimpleExpression(boolean value){
        this.value = value;
    }

    @Override
    public boolean evaluate(){
        return value;
    }

    public void setValue(boolean newVal){
        this.value = newVal;
    }


}
