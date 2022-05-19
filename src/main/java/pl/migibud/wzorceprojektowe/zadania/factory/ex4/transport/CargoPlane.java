package pl.migibud.wzorceprojektowe.zadania.factory.ex4.transport;

public class CargoPlane implements Transport {
    @Override
    public void process() {
        System.out.println("CargoPlane: 2 godziny");
    }
}
