package ru.bekker.simuduck;

import ru.bekker.simuduck.behaivor.flying.FlyNoWay;
import ru.bekker.simuduck.behaivor.quacking.Quack;

public class ModelDuck extends Duck {
    private final String whoAmI = "model duck";
    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
        setName(whoAmI);
    }
}
