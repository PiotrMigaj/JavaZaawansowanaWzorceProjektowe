package pl.migibud.wzorceprojektowe.zadania.observer.ex4;

import pl.migibud.wzorceprojektowe.zadania.observer.ex4.news.InternetNews;
import pl.migibud.wzorceprojektowe.zadania.observer.ex4.news.RadioNews;
import pl.migibud.wzorceprojektowe.zadania.observer.ex4.weatherforecast.WeatherForecast;

public class Main {



    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast();
        weatherForecast.registerObserver(new RadioNews());
        weatherForecast.registerObserver(new InternetNews());

        weatherForecast.notifyObservers();
        System.out.println();
        weatherForecast.updateForecast(35,1200);

    }

}
