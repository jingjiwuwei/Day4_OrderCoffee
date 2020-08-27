package SyrupType;

import CoffeeType.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    protected int num;
    public abstract String getDescription();
}
