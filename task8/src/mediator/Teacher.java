package mediator;

public class Teacher extends User {
    public Teacher(Mediator mediator, String name){
        super(mediator, name);
    }
    @Override
    public void send(String msg) {
        this.mediator.sendMessage(msg+" from Teacher");
    }
}
