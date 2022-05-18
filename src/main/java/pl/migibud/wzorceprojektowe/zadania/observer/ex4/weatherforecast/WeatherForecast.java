package pl.migibud.wzorceprojektowe.zadania.observer.ex4.weatherforecast;

import pl.migibud.wzorceprojektowe.zadania.observer.ex4.news.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable{

    int temperature;
    int pressure;
    Set<Observer> registeredObservers = new HashSet<>();

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.registeredObservers.forEach(v->v.updateForecast(this));
    }

    public void  updateForecast(int temperature,int pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }
}
