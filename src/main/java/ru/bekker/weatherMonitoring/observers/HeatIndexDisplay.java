package ru.bekker.weatherMonitoring.observers;

import ru.bekker.weatherMonitoring.Subject;

import static java.lang.Math.pow;

public class HeatIndexDisplay extends AbstractObserver {


    public HeatIndexDisplay(Subject weatherData) {
        super(weatherData);
    }

    @Override
    public void display() {

    }

    private double getHeatIndex() {
        return 16.923 + 1.85212 * pow(10, -1) * getTemperature() + 5.37941 * getHumidity() - 1.00254 * pow(10, -1) * getTemperature() *
                getHumidity() + 9.41695 * pow(10, -3) * pow(getTemperature(), 2) + 7.28898 * pow(10, -3) * pow(getHumidity(), 2)
                + 3.45372 * pow(10, -4) * pow(getTemperature(), 2) * getHumidity() - 8.14971 * pow(10, -4) * getTemperature()
                * pow(getHumidity(), 2) + 1.02102 * pow(10, -5) * pow(getTemperature(), 2)
                * pow(getHumidity(), 2) - 3.8646 *  pow(10, -5) * pow(getTemperature(), 3) + 2.91583 * pow(10, -5) * pow(getHumidity(), 3)
                + 1.42721 * pow(10, -6) * pow(getTemperature(), 3) * getHumidity() + 1.97483
                * pow(10, -7) * getTemperature() * pow(getHumidity(), 3) - 2.18429 * pow(10, -8) * pow(getTemperature(), 3) * pow(getHumidity(), 2)
                + 8.43296 * pow(10, -10) * pow(getTemperature(), 2) * pow(getHumidity(), 3) - 4.81975 * pow(10, -11) * pow(getTemperature(), 3)
                * pow(getHumidity(), 3);
    }
}
