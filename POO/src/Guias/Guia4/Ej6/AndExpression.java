package Guias.Guia4.Ej6;

public class AndExpression extends BinaryExpression{

    public AndExpression(Expression exp1, Expression exp2){
        super(exp1, exp2);
    }

    @Override
    public boolean evaluate(){
        return exp1.evaluate() && exp2.evaluate();
    }

}
