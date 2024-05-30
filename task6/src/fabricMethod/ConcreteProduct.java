package fabricMethod;

public class ConcreteProduct implements Product{
    @Override
    public void perform() {
        System.out.println("Concrete product created by fabric method");
    }
}
