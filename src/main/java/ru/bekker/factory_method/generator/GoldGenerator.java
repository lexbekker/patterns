package ru.bekker.factory_method.generator;

import ru.bekker.factory_method.model.GameItem;
import ru.bekker.factory_method.model.GoldReward;

public class GoldGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
