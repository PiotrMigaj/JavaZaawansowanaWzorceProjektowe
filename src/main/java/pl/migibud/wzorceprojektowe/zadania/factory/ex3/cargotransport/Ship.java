package pl.migibud.wzorceprojektowe.zadania.factory.ex3.cargotransport;

public class Ship implements CargoTransport{
    @Override
    public void process() {
        System.out.println("1 tydzień");
    }
}
