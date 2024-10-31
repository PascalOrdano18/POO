package Guias.Guia4.Ej7;

import java.util.Objects;

public class Interval {
    private final double start, end, increment;

    public Interval(double start, double end, double increment){
        if((start > end && increment > 0) || (start < end && increment < 0)){
            this.start = start;
            this.end = end;
            this.increment = increment;
        }
        else {
            throw new IllegalArgumentException("Incremento no puede ser 0");
        }

    }

    public Interval(double start, double end){
        this(start, end, 1);
    }

    public long size(){
        return (long)((end - start) / increment);
    }

    public double at(long index){
        if(index < 0){
            throw new IllegalArgumentException("Index menor que 0");
        }
        return (start + (index * increment));
    }

    public boolean includes(double valor){
        return valor >= start && valor <= end;
    }

    @Override
    public String toString(){
        return "El intervalo va desde %d hasta %d con un incremento de %d".formatted(start, end, increment);
    }

    @Override
    public int hashCode(){
        return Objects.hash(start, end, increment);
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Interval interval &&
                Double.compare(interval.start, start) == 0 &&
                Double.compare(interval.end, end) == 0 &&
                Double.compare(interval.increment, increment) == 0;
    }


}
