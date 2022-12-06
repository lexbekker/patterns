package ru.bekker.factory_method.generator;

import ru.bekker.factory_method.model.GameItem;
import ru.bekker.factory_method.model.GemReward;

public class GemGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
