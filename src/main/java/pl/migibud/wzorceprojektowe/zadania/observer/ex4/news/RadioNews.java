package pl.migibud.wzorceprojektowe.zadania.observer.ex4.news;

import pl.migibud.wzorceprojektowe.zadania.observer.ex4.weatherforecast.WeatherForecast;

public class RadioNews implements Observer{

    int temperature;
    int pressure;

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        this.temperature = weatherForecast.getTemperature();
        this.pressure= weatherForecast.getPressure();
        System.out.printf("Radio - nowa prognoza pogody: temperatura: %s stopni, ciśnienie: %shPa\n",temperature,pressure);
    }


}
