package ru.bekker.creational.factory_method.ex2;

public class Cadillac implements Car {
    @Override
    public void drive() {
        System.out.println("Cadillac driving city with 100 mp/h");
    }

    @Override
    public void stop() {
        System.out.println("Cadillac stopped at 3 seconds");
    }

    @Override
    public void info() {
        System.out.println("Cadillac is best for beach driving. ");
    }
}
