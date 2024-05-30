package iterator;

public class ConcreteAggregate implements Aggregate{
    private int[] array = {1,2,3,4,5,6};
    private Iterator iterator = new ConcreteIterator(this.array);
    @Override
    public Iterator createIterator() {
        return iterator;
    }
}
