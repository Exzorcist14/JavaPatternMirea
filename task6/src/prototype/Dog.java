package prototype;

public class Dog implements Prototype{
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void printInfo(){
        System.out.println("Dog's name is "+this.name+"\n" +
                "Dog's age is "+this.age);
    }

    @Override
    public Dog clone() {
        return new Dog(this.name, this.age);
    }
}
