package org.example.AbstractFactoryDesignPattern;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Android developer salary");
        return 50000;
    }
}
