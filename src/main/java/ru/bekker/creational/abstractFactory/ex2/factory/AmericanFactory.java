package ru.bekker.creational.abstractFactory.ex2.factory;

import ru.bekker.creational.abstractFactory.ex2.transport.Boeing747;
import ru.bekker.creational.abstractFactory.ex2.transport.Porsche;
import ru.bekker.creational.abstractFactory.ex2.transport.Aircraft;
import ru.bekker.creational.abstractFactory.ex2.transport.Car;

public class AmericanFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
