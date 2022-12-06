package ru.bekker.factory_method.model;

public class GoldReward implements GameItem {
    @Override
    public void open() {
        // todo add open business logic
        System.out.println("GoldReward opened");
    }
}
