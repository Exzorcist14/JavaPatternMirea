package abstractFabric;

public class LadaFactory implements CarFactory{
    @Override
    public Car createSedan() {
        return new LadaSedan();
    }

    @Override
    public Car createCoupe() {
        return new LadaCoupe();
    }

    class LadaSedan implements Car{
        @Override
        public void drive() {
            System.out.println("Lada sedan drive");
        }
    }
    class LadaCoupe implements Car{
        @Override
        public void drive() {
            System.out.println("Lada coupe drive");
        }
    }
}
