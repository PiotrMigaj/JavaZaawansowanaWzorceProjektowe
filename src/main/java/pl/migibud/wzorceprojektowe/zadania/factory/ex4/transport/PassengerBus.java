package pl.migibud.wzorceprojektowe.zadania.factory.ex4.transport;

public class PassengerBus implements Transport{
    @Override
    public void process() {
        System.out.println("PassengerBus: 7 godzin");
    }
}
