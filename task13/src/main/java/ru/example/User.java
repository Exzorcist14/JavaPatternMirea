package ru.example;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
@ToString
public class User {

    @Value("${student.name}")
    private final String name;

    @Value("${student.last_name}")
    private final String last_name;

    @Value("${student.group}")
    private final String group;

    @PostConstruct
    public void start() {
        log.info("create user: {}", this);
    }
}
