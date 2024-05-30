package mediator;

abstract public class User {
    protected Mediator mediator;
    public String name;
    public User(Mediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }
    public abstract void send(String msg);
}
