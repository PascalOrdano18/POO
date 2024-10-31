package Guias.Guia7.Ej1;

@FunctionalInterface
public interface Criteria<E> {
    boolean crit(E elem);
}
