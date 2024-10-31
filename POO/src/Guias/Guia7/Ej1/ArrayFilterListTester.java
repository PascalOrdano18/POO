package Guias.Guia7.Ej1;

public class ArrayFilterListTester {

    public static void main(String[] args){
        FilterList<Integer> list = new ArrayFilterList<>();
        list.add(10);
        list.add(2);
        list.add(5);
        list.add(9);

        System.out.println(list.filter(x -> x % 2 == 0));
    }

}
