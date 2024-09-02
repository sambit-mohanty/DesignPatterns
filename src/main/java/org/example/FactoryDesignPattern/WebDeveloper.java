package org.example.FactoryDesignPattern;

public class WebDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("Web Developer");
        return 40000;
    }
}
