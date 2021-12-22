import entity.*;
import place.Place;

public class Main {
    public static void main(String[] args) {
        Article article = new Article("Статейка", Place.Newspaper);
        Lords lords = new Lords("Владельцы гигантских акций");
        StocksOfBirge stocksOfBirge = new StocksOfBirge("Акции", Place.Barge);
        Noone noone = new Noone("Никто ");
        RichCrew bogachi = new RichCrew("Трое богачей ");
        Gadkinz gadkinz = new Gadkinz("господин Гадкинз ");
        GadkinzArticle gadkinzArticle = new GadkinzArticle("Ряд статей");

        article.appeared();
        stocksOfBirge.checkCurrentPrice();
        lords.sellOrSave(article, stocksOfBirge);
        stocksOfBirge.checkCurrentPrice();
        noone.dontWantorWant(stocksOfBirge);
        lords.checkMood();
        bogachi.pay(gadkinz);
        gadkinz.makeArticle(gadkinzArticle);
        gadkinzArticle.fixSituation();

        stocksOfBirge.checkCurrentPrice();
        lords.checkMood();


    }
}










