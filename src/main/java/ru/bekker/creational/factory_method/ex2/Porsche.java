package ru.bekker.creational.factory_method.ex2;

public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Porsche, max speed us 150 mp/h");
    }

    @Override
    public void stop() {
        System.out.println("Porsche stop in 2 seconds");
    }

    @Override
    public void info() {
        System.out.println("Porsche is very fast car, best for city driving");
    }
}
