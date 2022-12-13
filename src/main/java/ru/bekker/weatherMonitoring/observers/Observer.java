package ru.bekker.weatherMonitoring.observers;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
