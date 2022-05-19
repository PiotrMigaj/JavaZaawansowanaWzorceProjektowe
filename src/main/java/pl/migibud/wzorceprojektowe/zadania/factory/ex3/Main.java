package pl.migibud.wzorceprojektowe.zadania.factory.ex3;

import pl.migibud.wzorceprojektowe.zadania.factory.ex3.cargotransport.CargoTransport;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<CargoTransport> cargoTransport1 = Optional.ofNullable(TransportFactory.getTransport("ship1"));
        System.out.println(cargoTransport1);

    }
}
