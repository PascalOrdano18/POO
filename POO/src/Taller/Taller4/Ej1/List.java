package Taller.Taller4.Ej1;

public interface List <T> {
    int contains(T elem);
    void add(T elem);
    boolean isEmpty();
    boolean removeElementAtIndex(int index);

    default boolean removeElement(T elem){
        int index = contains(elem);
        if(index != -1){
            return removeElementAtIndex(index);
        }
        return false;
    }

}
