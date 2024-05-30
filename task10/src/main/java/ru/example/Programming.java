package ru.example;
import org.springframework.stereotype.Component;
import ru.example.Programmer;


@Component
public class Programming {
    private Programmer programmer;

    public void setType(Programmer programmer) {
        this.programmer = programmer;
    }

    public void DoProgramming() {
        System.out.println(programmer.doCoding());
    }
}
