package pl.migibud.wzorceprojektowe.zadania.observer.ex4.weatherforecast;

import pl.migibud.wzorceprojektowe.zadania.observer.ex4.news.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
