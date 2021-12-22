package ect;

public enum Price {

    Low(" цена начала снижаться"),
    Normal(" цена осталась неизменной"),
    High(" цена резко поднялась");

    private String cost;

    Price(String cost) {
        this.cost = cost;
    }


    public void setCost(String cost) {
        this.cost = cost;
    }


    public String getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[price:" + cost + "]";
    }

}

