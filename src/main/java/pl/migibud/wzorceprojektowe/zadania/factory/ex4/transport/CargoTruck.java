package pl.migibud.wzorceprojektowe.zadania.factory.ex4.transport;

public class CargoTruck implements Transport {
    @Override
    public void process() {
        System.out.println("CargoTruck: 8 godzin");
    }
}
