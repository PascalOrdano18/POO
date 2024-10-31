package Guias.Guia4.Ej6;

public abstract class BinaryExpression extends Expression{

    protected Expression exp1, exp2;

    public BinaryExpression(Expression exp1, Expression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public abstract boolean evaluate();
}
