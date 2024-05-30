package ru.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
	public static void main(String... args) {
		ApplicationContext context = SpringApplication.run(Main.class, args);

		//new ComponentClass(args[0], args[1]);
		new ComponentClass();
		SpringApplication.exit(context);
	}
}
