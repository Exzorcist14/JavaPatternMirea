package iterator;

public class ConcreteIterator implements Iterator{
    private int[] array;
    private int current = 0;
    public ConcreteIterator(int[] array){
        this.array = array;
    }
    @Override
    public void next() {
        if(current<this.array.length){
            System.out.println(this.array[current]);
            current++;
        }else{
            System.out.println("Iterator finished");
        }
    }
}
