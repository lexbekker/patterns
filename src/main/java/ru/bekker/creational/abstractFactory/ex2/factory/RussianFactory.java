package ru.bekker.creational.abstractFactory.ex2.factory;

import ru.bekker.creational.abstractFactory.ex2.transport.Niva;
import ru.bekker.creational.abstractFactory.ex2.transport.TU134;
import ru.bekker.creational.abstractFactory.ex2.transport.Aircraft;
import ru.bekker.creational.abstractFactory.ex2.transport.Car;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
