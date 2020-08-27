package CoffeeType;

import MustSetting.*;


public class Latte extends Beverage {
    public Latte(){

        description = "拿铁";
        cupSize = CupSize.Grande;
        temprature = Temprature.Icefree;
        milk = Milk.Ori;
    }

    @Override
    public double cost() {
        switch (getSize()){
            case Tall:
                return 34;
            case Grande:
                return 36;
            case Venti:
                return 38;
            default:
                return 36;
        }

    }
}
