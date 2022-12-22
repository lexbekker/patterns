package ru.bekker.creational.factory_method.ex1.generator;

import ru.bekker.creational.factory_method.ex1.model.GameItem;

public abstract class ItemGenerator {

    public void openReward() {
        // ...
        GameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract GameItem createItem();
}
