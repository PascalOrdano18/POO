package Guias.Guia6.Ej3;

public class Pair <E>{

    private E right, left;

    public Pair(E left, E right){
        this.right = right;
        this.left = left;
    }

    public String toString(){
        return "# %s + %s #".formatted(left, right);
    }

}
