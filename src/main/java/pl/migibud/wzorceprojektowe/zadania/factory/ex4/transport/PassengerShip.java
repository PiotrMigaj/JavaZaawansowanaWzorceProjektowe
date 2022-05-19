package pl.migibud.wzorceprojektowe.zadania.factory.ex4.transport;

public class PassengerShip implements Transport{
    @Override
    public void process() {
        System.out.println("PassengerShip: 5 godzin");
    }
}
