package pl.migibud.wzorceprojektowe.zadania.observer.ex4.news;

import pl.migibud.wzorceprojektowe.zadania.observer.ex4.weatherforecast.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
