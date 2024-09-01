package org.example.DecoratorDesignPattern;

public class ExtraMayoBurger extends BurgerDecorator {

    private Burger burger;

    public ExtraMayoBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDesc() {
        return burger.getDesc() + " with Extra Mayo ";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 20.0;
    }
}
