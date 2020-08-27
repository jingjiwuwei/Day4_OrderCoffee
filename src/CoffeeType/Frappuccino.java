package CoffeeType;

import MustSetting.*;


public class Frappuccino extends Beverage{

    public Frappuccino(){

        description = "星冰乐";
        cupSize = CupSize.Grande;
        temprature = Temprature.Icefree;
        milk = Milk.Ori;
    }
    @Override
    public double cost() {
        switch (getSize()){
            case Tall:
                return 32;
            case Grande:
                return 34;
            case Venti:
                return 36;
            default:
                return 34;
        }
    }
}
