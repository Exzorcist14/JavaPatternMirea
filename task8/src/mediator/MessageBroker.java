package mediator;

import java.util.ArrayList;
import java.util.List;

public class MessageBroker implements Mediator{
    private List<User> users;
    public MessageBroker(){
        this.users = new ArrayList<>();
    }
    @Override
    public void addUser(User u) {
        this.users.add(u);
    }

    @Override
    public void sendMessage(String msg) {
        for(User u: this.users){
            System.out.println("User "+u.name + " has received message: "+msg);
        }
    }
}
