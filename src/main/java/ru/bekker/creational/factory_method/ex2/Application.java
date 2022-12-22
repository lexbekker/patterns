package ru.bekker.creational.factory_method.ex2;

import static ru.bekker.creational.factory_method.ex2.CarSelector.RoadType.*;
import static ru.bekker.creational.factory_method.ex2.CarSelector.getCar;

public class Application {
    public static void main(String[] args) {

        Car offRoadCar = getCar(OFF_ROAD);
        offRoadCar.info();

        Car beachCar = getCar(BEACH);
        beachCar.info();

        Car cityCar = getCar(CITY);
        cityCar.info();
    }
}
