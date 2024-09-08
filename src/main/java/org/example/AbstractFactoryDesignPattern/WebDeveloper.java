package org.example.AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Web Developer");
        return 40000;
    }
}
