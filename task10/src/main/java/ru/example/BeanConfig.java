package ru.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Junior junProgrammer () {
        return new Junior();
    }

    @Bean
    public Middle midProgrammer () {
        return new Middle();
    }

    @Bean
    public Senior senProgrammer () {
        return new Senior();
    }

    @Bean("jun")
    public Programming startProgrammingJun() {
        Programming programming = new Programming();
        programming.setType(junProgrammer());
        return programming;
    }

    @Bean("mid")
    public Programming startProgrammingMid() {
        Programming programming = new Programming();
        programming.setType(midProgrammer());
        return programming;
    }

    @Bean("sen")
    public Programming startProgrammingSen() {
        Programming programming = new Programming();
        programming.setType(senProgrammer());
        return programming;
    }
}
