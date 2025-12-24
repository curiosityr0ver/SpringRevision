package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    int age;

    public Alien() {
        System.out.println("I am alien !");
    }

    @Autowired
    Laptop lap;

    public void code(){
        lap.compile();
        System.out.println("Code compiled");
    }
}
