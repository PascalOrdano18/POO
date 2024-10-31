public class MultipleCounter extends Counter{
    private int value;

    public MultipleCounter(int value){
        this.value = value;
    }

    public void increaseCount(){
        count += value;
    }

    public void decreaseCount(){
        count -= value;
    }
}
