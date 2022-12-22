package ru.bekker.creational.factory_method.ex1.model;

public class GoldReward implements GameItem {
    @Override
    public void open() {
        // todo add open business logic
        System.out.println("GoldReward opened");
    }
}
