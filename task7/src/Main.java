import facade.Database;
import facade.FrontendOnReact;
import facade.HttpServer;
import facade.SystemFacade;
import proxy.CachingProxy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SystemFacade system = new SystemFacade(
                new Database(),
                new HttpServer(),
                new FrontendOnReact()
        );
        system.startSystem();
        Thread.sleep(3000);
        system.shutdownSystem();

        var proxy = new CachingProxy();
        System.out.println(proxy.getAnswer("Vanya"));
        System.out.println(proxy.getAnswer("Vanya"));
    }
}