package pl.migibud.wzorceprojektowe.zadania.factory.ex3.cargotransport;

public class Truck implements CargoTransport{
    @Override
    public void process() {
        System.out.println("3 dni");
    }
}
