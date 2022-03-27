package com.example.demo1;
import javax.ejb.*;

@Stateless
public class HelloWorldBean implements  HelloWorld{

    @Override
    public String sayHelloWorld() {
        return "Hello World from Maroun";
    }
}
