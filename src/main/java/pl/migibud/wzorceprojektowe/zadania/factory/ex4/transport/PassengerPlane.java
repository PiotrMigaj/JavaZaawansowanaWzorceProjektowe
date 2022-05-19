package pl.migibud.wzorceprojektowe.zadania.factory.ex4.transport;

public class PassengerPlane implements Transport{
    @Override
    public void process() {
        System.out.println("PassengerPlane: 1 godzina");
    }
}
