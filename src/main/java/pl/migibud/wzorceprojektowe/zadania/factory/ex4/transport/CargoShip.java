package pl.migibud.wzorceprojektowe.zadania.factory.ex4.transport;

public class CargoShip implements Transport {
    @Override
    public void process() {
        System.out.println("CargoShip: 5 godzin");
    }
}
