package Parciales.SegundosParciales.Practicas2doParcial.Ej1;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public interface SimpleList<T> extends List<T> {

    <E> Map<E, T> toMap(Function<T, E> mapper);

}
