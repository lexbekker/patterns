package ru.bekker.creational.abstractFactory.ex2.factory;

import ru.bekker.creational.abstractFactory.ex2.transport.Aircraft;
import ru.bekker.creational.abstractFactory.ex2.transport.Car;

// Фабрика по созданию транспортных средств
public interface TransportFactory {

    // Что фабрика будет производить
    Car createCar();

    Aircraft createAircraft();

}
