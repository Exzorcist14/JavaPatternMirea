import iterator.ConcreteAggregate;
import mediator.MessageBroker;
import mediator.Student;
import mediator.Teacher;
import mediator.User;

public class Main {
    public static void main(String[] args) {
        var aggregate = new ConcreteAggregate();
        var iterator = aggregate.createIterator();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();

        MessageBroker msgBroker = new MessageBroker();
        Teacher u1 = new Teacher(msgBroker, "Vova");
        Student u2 = new Student(msgBroker, "Vlad");
        Student u3 = new Student(msgBroker, "Dilya");
        Teacher u4 = new Teacher(msgBroker, "Natasha");
        msgBroker.addUser(u1);
        msgBroker.addUser(u2);
        msgBroker.addUser(u3);
        msgBroker.addUser(u4);
        u1.send("Message from User with name: "+u1.name);
    }
}