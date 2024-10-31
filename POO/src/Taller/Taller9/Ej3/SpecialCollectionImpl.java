package Taller.Taller9.Ej3;

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.function.Predicate;

public class SpecialCollectionImpl<T extends Comparable<? super T>> extends TreeSet<T> implements SpecialCollection<T>{

    private final Deque<T> deleted = new LinkedList<>();

    public SpecialCollectionImpl() {
        super(Comparator.reverseOrder());
    }

    @Override
    public void deleteFirst(Predicate<T> predicate){
        T first = getFirst();
        if(predicate.test(first)){
            remove(first);
            deleted.push(first);
        }
    }

    @Override
    public void undoDeleteFirst(){
        if(deleted.isEmpty()){
            throw new NothingToUndoException();
        }
        add(deleted.pop());
    }


}
