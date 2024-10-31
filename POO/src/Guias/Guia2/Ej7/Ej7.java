package Guias.Guia2.Ej7;

public class Ej7 {
    public static void main(String[] args){
        // Chequeo que todos los valores esten entre 0 y 100
        int[] frec = new int[10];
        int max = 0;
        for(String s : args){
            int i = Integer.parseInt(s) / 10;
            if(i <= 0 || i >=10){
                System.out.println("Wrong input");
                return ;
            }
            frec[i]++;
            if (frec[i] > max) {
                max = frec[i];
            }
        }
//        printHistogram(frec, max);
    }
}
