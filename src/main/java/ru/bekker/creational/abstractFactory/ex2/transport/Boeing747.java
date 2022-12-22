package ru.bekker.creational.abstractFactory.ex2.transport;

public class Boeing747 implements Aircraft {

    {
        System.out.println("You created Boeing-747");
    }

    @Override
    public void flight() {
        System.out.println("You are flying on Boeing 747");
    }
}
