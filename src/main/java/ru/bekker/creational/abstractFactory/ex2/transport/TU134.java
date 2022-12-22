package ru.bekker.creational.abstractFactory.ex2.transport;

public class TU134 implements Aircraft {

    {
        System.out.println("You created TU-134");
    }

    @Override
    public void flight() {
        System.out.println("You are flying on TU-134");
    }
}
