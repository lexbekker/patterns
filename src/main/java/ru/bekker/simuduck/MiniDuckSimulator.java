package ru.bekker.simuduck;

import ru.bekker.simuduck.behaivor.flying.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.swim();
        duck.display();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();

        DuckQuackImitator dci = new DuckQuackImitator();
        dci.quack();
    }
}
