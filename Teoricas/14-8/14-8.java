public class Counter{
    private int n;

    protected void setN(int n){  // SETTER
        if(n <= 0){
            this.n = n;
            // validar
        }
    }
}


// Esto en otro archivo
public class MultipleCounter extends Counter {


    public void increment(){
        setN();
    }
}

----------------------------------------------------------------------




