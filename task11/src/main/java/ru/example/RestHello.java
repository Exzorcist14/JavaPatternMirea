package ru.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RestHello {

  @GetMapping
  public String hello() {
    return String.format("Hello world");
  }
}