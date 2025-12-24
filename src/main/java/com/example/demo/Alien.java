package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Alien {
    @Setter
    @Getter
    @Value("${alien.age:18}")
    private int age;

    @Autowired
    @Getter
    @Setter
    private Laptop lap;

    @Autowired
    public Alien(
          @Value("${alien.age:18}")  int age
    ) {
        this.age = age;
        System.out.println("I am alien !");
    }

    public void code() {
        lap.compile();
        System.out.println("Code compiled");
    }
}
