package mediator;

public class Student extends User{
    public Student(Mediator mediator, String name){
        super(mediator, name);
    }
    @Override
    public void send(String msg) {
        this.mediator.sendMessage(msg+" from Student");
    }
}
