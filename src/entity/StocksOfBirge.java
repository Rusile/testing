package entity;

import ect.Price;
import place.Place;

//  акции
public class StocksOfBirge extends Entity {

    private static Price price = Price.Normal;

    public StocksOfBirge(String name, Place place) {
        super(name, place);
    }

    public void checkCurrentPrice() {
        System.out.println(getName() + ":" + price.getCost() + getPlace().getName());
    }

    public static Price getPrice() {
        return price;
    }

    public static void setPrice(Price price) {
        StocksOfBirge.price = price;
    }
}
