public class Counter {
    protected int count;

    public int getCount(){
        return count;
    }
    public void increaseCount(){
        count++;
    }
    public void decreaseCount(){
        count--;
    }

    public void megaIncrease(){
        count += 100;
    }
    public void resetCounter(){
        count = 0;
    }
}
