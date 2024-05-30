import abstractFabric.CarFactory;
import abstractFabric.LadaFactory;
import abstractFabric.MercedesFactory;
import builder.ConcreteBuilder;
import builder.Director;
import fabricMethod.ConcreteCreator;
import fabricMethod.Creator;
import fabricMethod.Product;
import prototype.Dog;

public class Main {
    public static void main(String[] args) {
        //fabric method
        Creator creator = new ConcreteCreator();
        Product product = creator.create();
        product.perform();
        //abstract factory
        CarFactory fabric = new MercedesFactory();
        fabric.createCoupe().drive();
        fabric.createSedan().drive();
        fabric = new LadaFactory();
        fabric.createCoupe().drive();
        fabric.createSedan().drive();
        //builder
        var point = new Director(new ConcreteBuilder()).createPoint();
        System.out.println(point);
        //prototype
        var dog1 = new Dog("Alice", 12);
        dog1.printInfo();
        var clone = dog1.clone();
        clone.printInfo();
    }
}