package entity;

import ect.WithStatus;
import place.Place;

public class Gadkinz extends EntityWithMoney implements WithStatus {


    public Gadkinz(String name) {
        super(name);
    }

    //господин Гадкинз

    @Override
    public String showStatus() {
        return ", владелец нескольких давилонских газет, ";
    }

    public void verifyTransaction(EntityWithMoney payer) {
        setIsReceivedMoney(payer.getIsPaidMoney());
    }

    public void makeArticle(GadkinzArticle article) {
        if (getIsReceivedMoney()) {
            article.setIsAppeared(true);
            System.out.println(getName() + showStatus() + " написал статьи");
        } else
            System.out.println(getName() +showStatus()  + " не захотел писать статьи");
    }
}
