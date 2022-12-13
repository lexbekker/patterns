package ru.bekker.weatherMonitoring;

import ru.bekker.weatherMonitoring.observers.CurrentConditionsDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(22F, 124.22F, 54F);
        weatherData.removeObserver(conditionsDisplay);
        weatherData.setMeasurements(22, 124.22F, 54.3231F);

    }
}
