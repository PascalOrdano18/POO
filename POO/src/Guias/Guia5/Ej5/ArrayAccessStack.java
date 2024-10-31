package Guias.Guia5.Ej5;
public class ArrayAccessStack<E> extends ArrayStack <E> implements AccessStack<E> {
    private int popAccesses;

    public ArrayAccessStack(){
        super(); //llamo al constructor de ArrayStack
    }

    @Override
    public E pop(){
        E res = super.pop();
        popAccesses++;
        return res;
    }

    @Override
    public int getPopAccesses(){
        return popAccesses;
    }

    @Override
    public int getPushAccesses(){
        return dim + popAccesses;
    }
}
