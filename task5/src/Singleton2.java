public class Singleton2{
    private static Singleton2 INSTANCE;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
    public void printMessage(){
        System.out.println("Message from singleton2");
    }
}