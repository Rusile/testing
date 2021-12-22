package entity;

import ect.Price;

public class Noone extends Entity {


    public Noone(String name) {
        super(name);
    }

    //никто

    public void dontWantorWant(StocksOfBirge stocksOfBirge) {
        if (StocksOfBirge.getPrice() == Price.Low)
            System.out.println(getName() + " не хотел покупать акции");
        if (StocksOfBirge.getPrice() == Price.Normal)
            System.out.println(getName() + " не остался в минусе");

    }
}
