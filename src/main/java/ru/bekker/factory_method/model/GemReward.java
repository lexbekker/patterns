package ru.bekker.factory_method.model;

public class GemReward implements GameItem {
    @Override
    public void open() {
        // todo: other business logic
        System.out.println("GemReward opened");
    }
}
