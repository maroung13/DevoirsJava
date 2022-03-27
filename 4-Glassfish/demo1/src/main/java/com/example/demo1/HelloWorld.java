package com.example.demo1;
import javax.ejb.*;

@Local
public interface HelloWorld {
    public String sayHelloWorld();
}
