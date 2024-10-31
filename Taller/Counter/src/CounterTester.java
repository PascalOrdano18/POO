
public class CounterTester {
    public static void main(String[] args) {

        Counter counter = new MultipleCounter(4); // Constructor

        System.out.println(counter.getCount());
        counter.increaseCount();
        System.out.println(counter.getCount());
        counter.decreaseCount();
        System.out.println(counter.getCount());
        counter.megaIncrease();
        System.out.println(counter.getCount());
        counter.resetCounter();
        System.out.println(counter.getCount());
        counter.decreaseCount();
        counter.decreaseCount();
        counter.decreaseCount();
        System.out.println(counter.getCount());
        counter.megaIncrease();
        System.out.println(counter.getCount());
        counter.increaseCount();
        counter.increaseCount();
        counter.increaseCount();
        counter.increaseCount();
        counter.increaseCount();
        System.out.println(counter.getCount());


    }
}
