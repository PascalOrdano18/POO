package Guias.Guia4.Ej12;


public class LinearListImpl implements LinearList{
    private int size = 0;
    private Node first;

    @Override
    public void add(Object o){
        if(size == 0){
            first = new Node(o, null);
        } else {
            Node current = first;
            while(current.tail != null){
                current = current.tail;
            }
            current.tail = new Node(o, null);
        }
        size++;
    }

    @Override
    public Object get(int i){
        Node n = getNode(i);
        return n.head;
    }

    private Node getNode(int i){
        if(i < 0 || i > size){
            throw new InvalidIndexxException(i);
        }
        Node current = first;
        while(i > 0){
            current = current.tail;
            i--;
        }
        return current;
    }

    @Override
    public void set(int i, Object o){
        Node n = getNode(i);
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
        Node n = getNode(i - 1);
        Node removedNode = getNode(i);
        if(removedNode.tail == null){
            n.tail = null;
        } else {
            n.tail = removedNode.tail;
        }
        size--;
    }

    @Override
    public int indexOf(Object o){
        Node current = first;
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

    private static class Node {
        private Object head;
        private Node tail;

        Node(Object head, Node tail){
            this.head = head;
            this.tail = tail;
        }
    }

}
