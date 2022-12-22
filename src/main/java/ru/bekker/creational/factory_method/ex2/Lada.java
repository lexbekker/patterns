package ru.bekker.creational.factory_method.ex2;

public class Lada implements Car {
    @Override
    public void drive() {
        System.out.println("Enjoy driving Lada on speed 60 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Enjoy use Lada's breaks, car will stop in 4 sec.");
    }

    @Override
    public void info() {
        System.out.println("The best Russian car, LADA!");
    }
}
