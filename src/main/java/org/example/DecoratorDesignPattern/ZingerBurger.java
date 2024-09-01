package org.example.DecoratorDesignPattern;

public class ZingerBurger extends Burger{
    @Override
    public String getDesc() {
        return "Zinger Burger";
    }

    @Override
    public double getCost() {
        return 180.0;
    }
}
