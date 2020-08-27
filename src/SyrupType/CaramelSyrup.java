package SyrupType;

import CoffeeType.Beverage;

public class CaramelSyrup extends CondimentDecorator {

    public CaramelSyrup(Beverage beverage){

        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " 配料另加焦糖糖浆1份";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 1.5;
    }

}
