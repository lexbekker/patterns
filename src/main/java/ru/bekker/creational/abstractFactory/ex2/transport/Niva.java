package ru.bekker.creational.abstractFactory.ex2.transport;

public class Niva implements Car {

    {
        System.out.println("You created Niva");
    }

    @Override
    public void drive() {
        System.out.println("You drive Niva");
    }

    @Override
    public void stop() {
        System.out.println("You stopped Niva.");
    }
}
