package ru.bekker.weatherMonitoring.observers;

import ru.bekker.weatherMonitoring.Subject;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("""
                ========== Current Conditions Display =============
                Current conditions: %.1fF degrees and %.1f humidity
                ===================================================
                """, temperature, humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
