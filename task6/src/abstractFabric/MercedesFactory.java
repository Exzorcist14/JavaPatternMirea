package abstractFabric;

public class MercedesFactory implements CarFactory{

    class MercedesSedan implements Car{
        @Override
        public void drive() {
            System.out.println("Mercedes sedan drive");
        }
    }
    class MercedesCoupe implements Car{
        @Override
        public void drive() {
            System.out.println("Mercedes coupe drive");
        }
    }
    @Override
    public Car createSedan() {
        return new MercedesSedan();
    }

    @Override
    public Car createCoupe() {
        return new MercedesCoupe();
    }
}
