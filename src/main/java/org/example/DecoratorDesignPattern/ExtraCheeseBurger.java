package org.example.DecoratorDesignPattern;

public class ExtraCheeseBurger extends BurgerDecorator {

    private Burger burger;

    public ExtraCheeseBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDesc() {
        return burger.getDesc() + " with extra cheese";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 10.0;
    }
}
