package CoffeeType;

import MustSetting.*;


public class Espresso extends Beverage{

    public Espresso(){
        description = "浓缩 ";
        cupSize = CupSize.Grande;
        temprature = Temprature.Icefree;
        milk = Milk.Ori;
    }
    @Override
    public double cost() {
        switch (getSize()){
            case Tall:
                return 30;
            case Grande:
                return 32;
            case Venti:
                return 34;
            default:
                return 32;

        }
    }
}
