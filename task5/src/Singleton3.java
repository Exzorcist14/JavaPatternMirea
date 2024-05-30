
public class Singleton3 {

    private Singleton3() {
    }
    public void printMessage(){
        System.out.println("Message from singleton 3");
    }
    private static class SingletonHolder {
        public static final Singleton3 HOLDER_INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
