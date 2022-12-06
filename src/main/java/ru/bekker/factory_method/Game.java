package ru.bekker.factory_method;

import ru.bekker.factory_method.generator.GemGenerator;
import ru.bekker.factory_method.generator.GoldGenerator;
import ru.bekker.factory_method.generator.ItemGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GemGenerator());
        generatorList.add(new GoldGenerator());

        for (int i = 0; i < 10; i++) {
            ItemGenerator itemGenerator = generatorList.get(random.nextInt(2));
            itemGenerator.openReward();
        }
    }
}
