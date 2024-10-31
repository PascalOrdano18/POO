package Guias.Guia4.Ej11;

public class Polynomial {
    private double[] polynomial;
    private final int dim;

    public Polynomial(int grade) throws InvalidGradeException{
        if(grade < 0){
            throw new InvalidGradeException();
        }
        this.dim = grade + 1;
        this.polynomial = new double[dim];
    }

    public void set(int index, double coef) throws InvalidIndexException{
        if(index > dim - 1 || index < 0){
            throw new InvalidIndexException(index);
        }
        polynomial[index] = coef;
    }

    public double eval(double value){
        double res = 0;
        for(int i = 0; i < dim; i++){
            res += Math.pow(value, i) * polynomial[i];
        }
        return res;
    }

}
