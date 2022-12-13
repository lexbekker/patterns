package ru.bekker.simuduck;

import ru.bekker.simuduck.behaivor.flying.FlyBehavior;
import ru.bekker.simuduck.behaivor.quacking.QuackBehavior;

/**
 * Классы-наследники должны переопределять поле name через setName()
 */
public class Duck {
    private String name = "Duck";
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public Duck() {
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Все утки плавают, даже деревянные!");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("I'm a " + getName() + ".");
    }
}
