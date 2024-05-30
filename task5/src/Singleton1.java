public class Singleton1 {
    private static Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){}
    public void printMessage(){
        System.out.println("Message from singleton 1");
    }
    public static Singleton1 getInstance(){
        return Singleton1.INSTANCE;
    }
}
