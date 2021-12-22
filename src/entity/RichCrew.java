package entity;

import ect.WithStatus;

public class RichCrew extends EntityWithMoney implements WithStatus {


    public RichCrew(String name) {
        super(name);
    }

    //Трое богачей Жмурик, Тефтель


    @Override
    public String showStatus() {
        return ", владельцы большого количества гигантских акций, ";
    }

    public void pay(EntityWithMoney receiver) {
        receiver.setIsReceivedMoney(true);
        System.out.println(getName() + showStatus() + " заплатили " + receiver.getName());
    }


}
