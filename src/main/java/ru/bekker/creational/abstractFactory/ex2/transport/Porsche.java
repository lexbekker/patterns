package ru.bekker.creational.abstractFactory.ex2.transport;

public class Porsche implements Car {

    {
        System.out.println("You created Porsche");
    }

    @Override
    public void drive() {
        System.out.println("You driving porsche.");
    }

    @Override
    public void stop() {
        System.out.println("Ypu stopped porsche.");
    }
}
