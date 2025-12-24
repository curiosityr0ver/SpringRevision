package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Getter
    @Setter
    private Computer comp;

    @Autowired
    public Alien(
            @Value("${alien.age:18}")  int age,
            @Qualifier("Desktop") @Autowired Computer lap
    ) {
        this.age = age;
        this.comp = lap;
        System.out.println("I am alien !");
    }

    public void code() {
        comp.compile();
    }
}
