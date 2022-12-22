package ru.bekker.creational.factory_method.ex2;

public class CarSelector {

    public static Car getCar(RoadType roadType) {
        return switch (roadType) {
            case CITY -> new Porsche();
            case OFF_ROAD -> new Jeep();
            case BEACH -> new Cadillac();
        };
    }



    enum RoadType {
        CITY, OFF_ROAD, BEACH
    }
}
