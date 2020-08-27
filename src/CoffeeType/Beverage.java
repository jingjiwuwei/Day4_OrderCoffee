package CoffeeType;

import MustSetting.*;


public abstract class Beverage {
    String description;
    CupSize cupSize = CupSize.Grande;
    Temprature temprature = Temprature.Icefree;
    Milk milk = Milk.Whole;

    public abstract double cost();

    public String getDescription(){

        return cupSize+description+temprature+"加"+milk;
    }

    public CupSize getSize() {
        return cupSize;
    }

    public void setSize(CupSize cupSize) {
        this.cupSize = cupSize;
    }

    public Temprature getTemprature() {
        return temprature;
    }

    public void setTemprature(Temprature temprature) {
        this.temprature = temprature;
    }


    public Milk getMilk() {
        return milk;
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
    }

}
