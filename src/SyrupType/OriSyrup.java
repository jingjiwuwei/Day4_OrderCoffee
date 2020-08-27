package SyrupType;

import CoffeeType.Beverage;

public class OriSyrup extends CondimentDecorator {
    public OriSyrup(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " 配料另加原味糖浆1份";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 2;
    }

}
