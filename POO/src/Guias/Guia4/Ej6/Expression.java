package Guias.Guia4.Ej6;

public abstract class Expression {

    public Expression not(){
        return new NotExpression(this);
    }

    public Expression and(Expression expression){
        return new AndExpression(this, expression);
    }

    public Expression or(Expression expression){
        return new OrExpression(this, expression);
    }


    public abstract boolean evaluate();
}
