package Guias.Guia5.Ej5;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E>{
    private E[] elements;
    private static final int INITIAL_DIM = 1;
    private static final int BLOCK = 10;
    protected int dim;

    private void memo(){
        if(dim == elements.length){
            elements = Arrays.copyOf(elements, dim + BLOCK);
        }
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(){
        elements = (E[]) new Object[INITIAL_DIM];
    }


    public void push(E elem){
        memo();
        elements[dim++] = elem;
    }

    public E peek(){
        return elements[dim - 1];
    }

    public E pop(){
        if(dim == 0){
            throw new EmptyArrayException();
        }
        E res = elements[dim - 1];
        dim--;
        return res;
    }

    public boolean isEmpty(){
        return dim == 0;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("[");
        for(int i = dim - 1; i >= 0; i--){
            stringBuilder.append(elements[i]).append(",");
        }
        stringBuilder.setCharAt(stringBuilder.length() - 1, ']');
        return stringBuilder.toString();
    }



}
