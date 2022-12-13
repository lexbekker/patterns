package ru.bekker.simuduck;

import ru.bekker.simuduck.behaivor.flying.FlyWithWings;
import ru.bekker.simuduck.behaivor.quacking.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
        setName("mallard duck");
    }
}
