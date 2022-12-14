package ru.bekker.weatherMonitoring.observers;

import ru.bekker.weatherMonitoring.Subject;

public abstract class AbstractObserver implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public AbstractObserver(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public abstract void display();

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public Subject getWeatherData() {
        return weatherData;
    }
}
