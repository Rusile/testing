package entity;

import ect.Price;

import java.util.Random;

public class GadkinzArticle extends Article {

    public GadkinzArticle(String name) {
        super(name);
    }

    //Ряд статей
    @Override
    public void appeared() {
        fixSituation();
        System.out.println(getName() + "появилась");
    }

    public void fixSituation() {
        int chance = new Random().nextInt(2);
        if (getIsAppeared() && chance == 1) {
            StocksOfBirge.setPrice(Price.High);
        }
    }
}
