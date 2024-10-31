package Taller.Taller4.Ej1;


import java.util.Arrays;

public class ArrayIntegerList implements List<Integer>{
    private Integer[] vec;
    private int occupied = 0;
    private static final int BLOCK = 10;
    public ArrayIntegerList(){
        vec = new Integer[BLOCK];
        int a = BLOCK;
    }

    public void add(Integer elem) {
        if(occupied == vec.length){
            vec = Arrays.copyOf(vec, vec.length + BLOCK);
        }

        vec[occupied] = elem;
        occupied++;
    }

    public int contains(Integer elem){
        for(int i = 0; i < occupied; i++){
            if(vec[i].equals(elem)){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        return vec.length != 0;
    }


    public boolean removeElementAtIndex(int index){
        if(occupied > index){
            vec[index] = vec[occupied - 1];
            occupied--;
            return true;
        }
        return false;

    }

}
