package ru.bekker.creational.factory_method.ex2;

public class Jeep implements Car {
    @Override
    public void drive() {
        System.out.println("Еду на джипе со скоростью 50 км/ч");
    }

    @Override
    public void stop() {
        System.out.println("Торможу за 5 секунд, большая масса");
    }

    @Override
    public void info() {
        System.out.println("Jeep is good for off-road, large cross-country capability");
    }
}
