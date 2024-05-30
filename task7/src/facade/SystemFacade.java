package facade;

public class SystemFacade {
    private Database db;
    private HttpServer server;
    private FrontendOnReact frontendOnReact;

    public SystemFacade(Database db, HttpServer server, FrontendOnReact frontendOnReact) {
        this.db = db;
        this.server = server;
        this.frontendOnReact = frontendOnReact;
    }
    public void startSystem(){
        db.startDatabase();
        server.startServer();
        frontendOnReact.startFrontend();
    }
    public void shutdownSystem(){
        db.shutdownDatabase();
        server.shutdownServer();
        frontendOnReact.shutdownFrontend();
    }
}
