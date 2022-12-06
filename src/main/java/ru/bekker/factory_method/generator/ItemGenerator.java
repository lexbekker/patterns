package ru.bekker.factory_method.generator;

import ru.bekker.factory_method.model.GameItem;

public abstract class ItemGenerator {

    public void openReward() {
        // ...
        GameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract GameItem createItem();
}
