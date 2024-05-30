package ru.example;
import org.springframework.stereotype.Component;

@Component
public class Junior implements Programmer {
    @Override
    public String doCoding() {
        return "Junior Impl";
    }
}
