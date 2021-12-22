package entity;


import place.Place;

public class Article extends Entity {

    private boolean isAppeared;


    public void setIsAppeared(boolean IsAppeared) {
        this.isAppeared = IsAppeared;
    }

    public boolean getIsAppeared() {
        return isAppeared;
    }


    public Article(String name) {
        super(name);
    }

    public Article(String name, Place place) {
        super(name, place);
    }


    public void appeared() {
        isAppeared = true;
        System.out.println(getName() + " появилась" + getPlace().getName());
    }

    @Override
    public boolean equals(Object anotherObject){
        if (!super.equals(anotherObject)) return false;
        Article another = (Article) anotherObject;
        return isAppeared == another.isAppeared;
    }
}
