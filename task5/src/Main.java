public class Main {
    public static void main(String[] args) {
        var s1 = Singleton1.getInstance();
        s1.printMessage();
        var s2 = Singleton2.getInstance();
        s2.printMessage();
        var s3 = Singleton3.getInstance();
        s3.printMessage();
    }
}