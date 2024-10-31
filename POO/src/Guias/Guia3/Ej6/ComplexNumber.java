package Guias.Guia3.Ej6;

import java.util.Objects;

public class ComplexNumber {

    private final double real, imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(Number real){
        this.real = real.doubleValue();
        this.imaginary = 0;
    }

    double getReal(){
        return real;
    }
    double getImaginary(){
        return imaginary;
    }

    public ComplexNumber plus(ComplexNumber complexNum){
        return new ComplexNumber(real + complexNum.real + imaginary + complexNum.imaginary);
    }

    public ComplexNumber plus(Number real){
        return plus(new ComplexNumber(real));    // Llamo a plus para un Number, pero antes llamo al constructor de un Number
    }

    public boolean equals(Object o){
        return o instanceof ComplexNumber that && Double.compare(this.real, that.real) == 0 && Double.compare(this.imaginary, that.imaginary) == 0;
    }

    public int hashCode(){
        return Objects.hash(real, imaginary);
    }



}
