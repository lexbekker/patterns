package ru.bekker.simuduck;

import ru.bekker.simuduck.behaivor.quacking.MuteQuack;
import ru.bekker.simuduck.behaivor.quacking.Quack;
import ru.bekker.simuduck.behaivor.quacking.QuackBehavior;

public class DuckQuackImitator implements QuackBehavior {
    private QuackBehavior quackBehavior;

    public DuckQuackImitator() {
        this.quackBehavior = new Quack();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
