package ru.bekker.creational.abstractFactory.ex2;

import ru.bekker.creational.abstractFactory.ex2.factory.AmericanFactory;
import ru.bekker.creational.abstractFactory.ex2.factory.RussianFactory;
import ru.bekker.creational.abstractFactory.ex2.factory.TransportFactory;
import ru.bekker.creational.abstractFactory.ex2.transport.Aircraft;
import ru.bekker.creational.abstractFactory.ex2.transport.Car;

public class Application {
    public static void main(String[] args) {
        TransportFactory factory = new RussianFactory();
        Car russianCar = factory.createCar();
        Aircraft russianAircraft = factory.createAircraft();

        factory = new AmericanFactory();
        Car usaCar = factory.createCar();
        Aircraft usaAircraft = factory.createAircraft();
    }
}
