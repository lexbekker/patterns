package ru.bekker.weatherMonitoring;

import ru.bekker.weatherMonitoring.observers.Observer;

public interface Subject {
    boolean registerObserver(Observer o);
    boolean removeObserver(Observer o);
    void notifyObservers();
}
