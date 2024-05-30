package ru.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.example.BeanConfig;


@SpringBootApplication
public class Main {
    public static void main(String... args) {
        SpringApplication.run(Main.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Programming programming = context.getBean("jun", Programming.class);
        programming.DoProgramming();

        programming = context.getBean("mid", Programming.class);
        programming.DoProgramming();

        programming = context.getBean("sen", Programming.class);
        programming.DoProgramming();
    }
}
