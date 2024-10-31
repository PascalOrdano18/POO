package Guias.Guia5.Ej3.Ej12;


public class LinearListImpl <T> implements LinearList <T> {
    private int size = 0;
    private Node<T> first;

    @Override
    public void add(T o){
        if(size == 0){
            first = new Node<>(o, null);
        } else {
            Node<T> current = first;
            while(current.tail != null){
                current = current.tail;
            }
            current.tail = new Node<>(o, null);
        }
        size++;
    }

    @Override
    public Object get(int i){
        Node<T> n = getNode(i);
        return n.head;
    }

    private Node<T> getNode(int i){
        if(i < 0 || i > size){
            throw new InvalidIndexxException(i);
        }
        Node<T> current = first;
        while(i > 0){
            current = current.tail;
            i--;
        }
        return current;
    }

    @Override
    public void set(int i, T o){
        Node<T> n = getNode(i);
        n.head = o;

    }

    @Override
    public void remove(int i){
        if(i > size){
            return ;
        }
        if(i == 1){
            first = null;
            size--;
            return ;
        }
        // Podria solo pedirle n a getNode y hacerlo mas eficiente aosidjfaoisjfaosid
        Node<T> n = getNode(i - 1);
        Node<T> removedNode = getNode(i);
        if(removedNode.tail == null){
            n.tail = null;
        } else {
            n.tail = removedNode.tail;
        }
        size--;
    }

    @Override
    public int indexOf(T o){
        Node<T> current = first;
        for(int i = 0; current.tail != null; i++){
            if(current.head.equals(o)){
                return i;
            }
            current = current.tail;
        }
        return -1;
    }


    public int size(){
        return size;
    }

    private static class Node <T>{
        private T head;
        private Node<T> tail;

        Node(T head, Node<T> tail){
            this.head = head;
            this.tail = tail;
        }
    }

}
