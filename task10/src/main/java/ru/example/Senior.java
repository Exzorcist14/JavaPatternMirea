package ru.example;
import org.springframework.stereotype.Component;

@Component
public class Senior implements Programmer {
    @Override
    public String doCoding() {
            return "Senior Impl";
    }
}
