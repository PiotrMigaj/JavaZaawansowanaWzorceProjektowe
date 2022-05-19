package pl.migibud.wzorceprojektowe.zadania.factory.ex3.cargotransport;

public class Plane implements CargoTransport{
    @Override
    public void process() {
        System.out.println("1 dzień");
    }
}
