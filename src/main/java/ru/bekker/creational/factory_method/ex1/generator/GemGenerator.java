package ru.bekker.creational.factory_method.ex1.generator;

import ru.bekker.creational.factory_method.ex1.model.GameItem;
import ru.bekker.creational.factory_method.ex1.model.GemReward;

public class GemGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
