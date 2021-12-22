package entity;

import ect.*;

public class Lords extends EntityWithMood {


    public Lords(String name) {
        super(name);
    }


    //Владельцы гигантских акций


    public void sellOrSave(Article article, StocksOfBirge stocksOfBirge) {
        if (article.getIsAppeared()) {
            System.out.println(getName() + " бросились продавать акции ");
            StocksOfBirge.setPrice(Price.Low);

        } else {
            System.out.println(getName() + " сохранили свои акции");
            StocksOfBirge.setPrice(Price.Normal);
        }
    }

    @Override
    public void checkMood() {
        if (StocksOfBirge.getPrice() == Price.Low) {
            setMood(" были в отчаянии");
            System.out.println(getName() + getMood());
        }
        if (StocksOfBirge.getPrice() == Price.High) {
            setMood(" чувствовали себя прекрасно");
            System.out.println(getName() + getMood());
        }
        if (StocksOfBirge.getPrice() == Price.Normal) {
            setMood(" были спокойны");
            System.out.println(getName() + getMood());
        }
    }


}
