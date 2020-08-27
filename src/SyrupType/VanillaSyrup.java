package SyrupType;

import CoffeeType.Beverage;

public class VanillaSyrup extends CondimentDecorator {


    public VanillaSyrup(Beverage beverage){

        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " 配料另加香草糖浆1份";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 3;
    }

}
