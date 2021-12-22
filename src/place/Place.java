package place;


public enum Place {
    Barge(" на давилонской барже"),
    GadkinzNewspaper(" в своих газетах"),
    Newspaper(" в газете <<Давилонские юморески>>"),
    Town(" в городе Паноптикум");


    private final String name;

    Place(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[place:" + name + "]";
    }

}
